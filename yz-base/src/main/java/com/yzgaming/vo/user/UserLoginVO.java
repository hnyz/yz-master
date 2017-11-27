package com.yzgaming.vo.user;

import java.io.Serializable;

public class UserLoginVO implements Serializable{
    private static final long serialVersionUID = 1899232511233819216L;


    /**
     * 登录用户名
     */
    private String mobile;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 确认密码
     */
    private  String passWordAgain;

    /**
     * 短信验证码
     */
    private String smsCode;

    /**
     * 用户昵称
     */
    private  String userName;
    public UserLoginVO(){
        super();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassWordAgain() {
        return passWordAgain;
    }

    public void setPassWordAgain(String passWordAgain) {
        this.passWordAgain = passWordAgain;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
