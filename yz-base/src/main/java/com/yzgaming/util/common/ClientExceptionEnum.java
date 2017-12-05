package com.yzgaming.util.common;

public enum ClientExceptionEnum {
    /*-------------------------*/
    VOLUME_INSUFFICIENT(6001,"点卷不足"),
    MATCH_OVERDUE(6002,"赛事已过期"),
    MATCH_CLOSE(6003,"赛事已被关闭")


    ;
    //状态码
    private int code;
    //返回消息
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ClientExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
