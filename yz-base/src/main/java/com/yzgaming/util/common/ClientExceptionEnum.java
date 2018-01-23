package com.yzgaming.util.common;

public enum ClientExceptionEnum {
    /*-------------------------*/
    VOLUME_INSUFFICIENT(600100,"点卷不足，前往充值？"),
    MATCH_OVERDUE(600200,"赛事已过期"),
    MATCH_CLOSE(600300,"赛事已被关闭"),
    /*-------------------------*/
    REPEAT_BINDING(700100,"请勿重复绑定游戏账号"),


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
