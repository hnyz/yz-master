package com.yzgaming.vo;


import com.yzgaming.model.user.UserInfo;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

/**
 * 用户信息
 */
public class UserInfoVO implements Serializable {
    // 自增ID
    private Long id;
    // 用户名
    private String username;
    // 用户类别,0为普通用户,100为管理员
    private Integer userType;
    // 邮箱
    private String email;
    // 手机号
    private String mobile;
    // 真实姓名
    private String realName;
    // 职称，称呼
    private String title;
    //
    private String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRealName() {
        return realName;
    }
    public String getNickName() {
        if(null != realName){
            return realName;
        } else {
            return email;
        }
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static UserInfoVO from(UserInfo userInfo){
        if (null == userInfo){return null;}
        UserInfoVO userVO = new UserInfoVO();
        BeanUtils.copyProperties(userInfo, userVO);
        return userVO;
    }
}
