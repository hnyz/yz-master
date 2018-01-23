package com.yzgaming.util.enmu;

public enum GameInfoCode {

    NOT_GAMEINFO(5001,"该用户未绑定游戏账号！"),
    NOT_THIS_GAMEINFO(5002,"该游戏账户不是您绑定的账户"),
    NO_MATCH_SIGN(5003,"您尚未报名任何赛事，快去首页或APP挑战吧"),

    //赛事报名业务异常
    INSUFFICIENT_VOLUME(600100,"点卷不足，前往充值？"),
    ;
    // 成员变量
    private int code; //状态码
    private String message; //返回消息

    GameInfoCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

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
}
