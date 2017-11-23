package com.yzgaming.util.common;

public class YZException extends  Exception {
    private String errorMsg;
    private String errorCode;

    public YZException(String errorMsg,String errorCode){
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

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
