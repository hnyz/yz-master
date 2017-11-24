package com.yzgaming.controller.user;

import com.yzgaming.annotation.Authorization;
import com.yzgaming.annotation.CurrentUser;
import com.yzgaming.dao.mysql.user.UserInfoMapper;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.mvc.result.JSONMessage;
import com.yzgaming.dao.redis.api.RedisBaseDAO;
import com.yzgaming.service.user.UserInfoService;
import com.yzgaming.util.common.MD5Util;
import com.yzgaming.util.common.RandomUtil;
import com.yzgaming.util.common.YZException;
import com.yzgaming.util.manager.TokenManager;
import com.yzgaming.vo.ResponseVO;
import com.yzgaming.vo.TokenModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private RedisBaseDAO redisBaseDAO;
    @Autowired
    private TokenManager tokenManager;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ResponseVO login(String mobile, String passWord) {
        //密码MD5
        Assert.notNull(mobile, "mobile can not be empty");
        Assert.notNull(passWord, "password can not be empty");
        //passWord= MD5Util.MD5(passWord);
        UserInfo user= null;
        try {
            user = userInfoService.loginBymobile(mobile,passWord);
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
    @RequestMapping("/sendSms")
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
    @RequestMapping("/register")
    public ResponseVO register(String mobile,String  smsCode){
        //手机验证码是否正确
        String code=redisBaseDAO.getString(mobile);
        if(code.equals("null")){
            return new ResponseVO(4002,"手机验证码已失效","");
        }else {
           if(!smsCode.equals(code)){
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

    /***
     * 设置用户名和密码 需要登录鉴权
     * @param userName
     * @param passWord
     * @param passWordAgain
     * @return
     */
    @RequestMapping("/setUserName")
    public ResponseVO setPassWordAndName(String userName,String passWord,String  passWordAgain){
        if (passWord.equals(passWordAgain)){

        }
        return null;
    }

    /**
     * 获取图片验证码
     * @return
     */
    @RequestMapping("/testuser")
    @Authorization
    public ResponseVO getImgCode(@CurrentUser UserInfo userInfo){
        System.out.println(userInfo.getId());
        return null;
    }
}
