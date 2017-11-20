package com.yzgaming.vo.user;

import java.io.Serializable;

public class RedisLoginVO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 8116817810829835862L;

    /**
     * 用户id
     */
    private String userId;

    /**
     * jwt生成的token信息
     */
    private String token;

    /**
     * 登录或刷新应用的时间
     */
    private long refTime;

    public RedisLoginVO() {
    }

    public RedisLoginVO(String userId, String token, long refTime) {
        this.userId = userId;
        this.token = token;
        this.refTime = refTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getRefTime() {
        return refTime;
    }

    public void setRefTime(long refTime) {
        this.refTime = refTime;
    }
}
