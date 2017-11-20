package com.yzgaming.vo.user;

import java.io.Serializable;

public class UserLoginVO implements Serializable{
    private static final long serialVersionUID = 1899232511233819216L;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 登录用户名
     */
    private String loginName;

    /**
     * 登录密码
     */
    private String password;

    public UserLoginVO(){
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
