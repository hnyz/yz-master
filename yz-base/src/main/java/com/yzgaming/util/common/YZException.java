package com.yzgaming.util.common;

public class YZException extends  RuntimeException {
    private String errorMsg;
    private Integer errorCode;

    public YZException(Integer errorCode,String errorMsg){
        super(errorMsg);
        this.errorCode=errorCode;
        this.errorMsg=errorMsg;
    }


    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
