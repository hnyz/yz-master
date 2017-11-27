package com.yzgaming.controller.user;

import com.yzgaming.annotation.Authorization;
import com.yzgaming.annotation.CurrentUser;
import com.yzgaming.dao.mysql.user.LolGameInfoMapper;
import com.yzgaming.dao.mysql.user.UserInfoMapper;
import com.yzgaming.model.user.LolGameInfo;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.mvc.result.JSONMessage;
import com.yzgaming.dao.redis.api.RedisBaseDAO;
import com.yzgaming.service.user.LolGameInfoService;
import com.yzgaming.service.user.UserInfoService;
import com.yzgaming.util.common.MD5Util;
import com.yzgaming.util.common.RandomUtil;
import com.yzgaming.util.common.YZException;
import com.yzgaming.util.manager.TokenManager;
import com.yzgaming.vo.ResponseVO;
import com.yzgaming.vo.TokenModel;
import com.yzgaming.vo.user.UserLoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private LolGameInfoMapper lolGameInfoMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private RedisBaseDAO redisBaseDAO;
    @Autowired
    private TokenManager tokenManager;

    /**
     * 账号密码登陆
     * @param userLoginVO
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseVO login(@RequestBody UserLoginVO userLoginVO) {
        //密码MD5

        //passWord= MD5Util.MD5(passWord);
        UserInfo user= null;
        try {
            user = userInfoService.loginBymobile(userLoginVO.getMobile(),userLoginVO.getPassword());
            //生成一个token，保存用户登录状态
            TokenModel model = tokenManager.createToken(user.getId());
            return new ResponseVO(200,"登录成功！",model);
        } catch (YZException e) {
            return new ResponseVO(Integer.parseInt(e.getErrorCode()),e.getMessage(),"");
        }

    }

    /**
     * 获取短信验证码
     * @param mobile
     * @return
     */
    @GetMapping("/sendSms")
    public ResponseVO getSmsCode(String mobile){
            //随机生成验证码
            String smsCode="123456";
            //String smsCode=  RandomUtil.getRandNum();
            //保存到Redis中
            redisBaseDAO.saveObject(mobile,smsCode,6000);
            //发送短信
            //
            return new ResponseVO(200,"验证码已发送到你的手机！","");

    }

    /***
     * 用户手机号注册
     * @return
     */
    @PostMapping("/register")
    public ResponseVO register(@RequestBody UserLoginVO userLoginVO){
        //手机验证码是否正确
        String mobile=userLoginVO.getMobile();
        String code=redisBaseDAO.getString(mobile);
        if(code.equals("null")){
            return new ResponseVO(4002,"手机验证码已失效","");
        }else {
           if(!userLoginVO.getSmsCode().equals(code)){
           return new ResponseVO(4001,"手机验证码不正确","");
        }
        }
        //手机号是否存在
        UserInfo user= userInfoMapper.getBymobile(mobile);
        if(user==null){
           //先注册
           UserInfo newUser= userInfoService.register(mobile);
           //生成一个token，保存用户登录状态
           TokenModel model = tokenManager.createToken(newUser.getId());
           return new ResponseVO(200,"登录成功！",model);
       }else{
            //直接登陆
            //生成一个token，保存用户登录状态
            TokenModel model = tokenManager.createToken(user.getId());
            return new ResponseVO(200,"登录成功！",model);
        }
    }

    /**
     * 设置用户昵称和密码需要鉴权
     * @param userInfo
     * @param userLoginVO
     * @return
     */
    @PostMapping("/setUserName")
    @Authorization
    public ResponseVO setPassWordAndName(@CurrentUser UserInfo userInfo,@RequestBody UserLoginVO userLoginVO){
        String passWord=userLoginVO.getPassword();
        String passWordAgain = userLoginVO.getPassWordAgain();
        if (passWord.equals(passWordAgain)){
            userInfo.setUserPassword(passWord);
            userInfo.setUserName(userLoginVO.getUserName());
            userInfoMapper.update(userInfo);
        }
        return new ResponseVO(200,"设置成功","");
    }

    /**
     * 获取图片验证码
     * @return
     */
    @RequestMapping("/testuser")
    public ResponseVO getImgCode( String mobile){
        System.out.println(mobile);
        return null;
    }

    /***
     *开始绑定游戏账户
     * @return
     */
    @PostMapping("bund-loler")
    @Authorization
    public ResponseVO bundlingLolgame(@CurrentUser UserInfo userInfo, @RequestBody LolGameInfo gameInfo){
        gameInfo.setUserId(Integer.parseInt(userInfo.getId().toString()));
        lolGameInfoMapper.insert(gameInfo);
        return new ResponseVO(200,"绑定成功","");
    }

    /**
     * 是否绑定了Lol游戏账户
     * @param userInfo
     * @return
     */
    @GetMapping("/exist-loler")
    @Authorization
    public  ResponseVO existenceLolgameInfo(@CurrentUser UserInfo  userInfo){
        //根据用户ID获取gameInfo
        LolGameInfo gameInfo=lolGameInfoMapper.getByUserId(Integer.parseInt(userInfo.getId().toString()));
        if(gameInfo==null){
            return new ResponseVO(6001,"该用户未绑定LOL账户","");
        }else{
            return new ResponseVO(200,"该用户已绑定LOL账户",gameInfo);
        }
    }
}

