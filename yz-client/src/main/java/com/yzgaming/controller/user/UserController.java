package com.yzgaming.controller.user;

import com.yzgaming.model.user.UserInfo;
import com.yzgaming.mvc.result.JSONMessage;
import com.yzgaming.dao.redis.api.RedisBaseDAO;
import com.yzgaming.service.user.UserInfoService;
import com.yzgaming.util.common.MD5Util;
import com.yzgaming.util.common.RandomUtil;
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

@Controller
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private RedisBaseDAO redisBaseDAO;
    @Autowired
    private TokenManager tokenManager;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public ResponseVO login(String mobile, String passWord) {
        Assert.notNull(mobile, "mobile can not be empty");
        Assert.notNull(passWord, "password can not be empty");
        //passWord= MD5Util.MD5(passWord);
      UserInfo user= userInfoService.loginByPass(mobile);
      System.out.println(user.getUserPassword());
        if (user == null ||  //未注册
                !user.getUserPassword().equals(passWord)) {  //密码错误
            //提示用户名或密码错误
            return new ResponseVO(3001,"用户名或密码错误","");
        }
        //生成一个token，保存用户登录状态
        TokenModel model = tokenManager.createToken(user.getId());
        return new ResponseVO(200,"登录成功！",model);
    }

    /**
     * 获取短信验证码
     * @param imgCode
     * @param mobile
     * @return
     */
    @RequestMapping("/sendSms")
    @ResponseBody
    public JSONMessage getSmsCode(String imgCode,String mobile){
        if(imgCode.equals("")){
            //随机生成验证码
            String smsCode=  RandomUtil.getRandNum();
            //保存到Redis中
            redisBaseDAO.saveObject(mobile,smsCode,6000);
            //发送短信

        }else{
            return  JSONMessage.failureMessage();
        }

        return   JSONMessage.successMessage();
    }
}
