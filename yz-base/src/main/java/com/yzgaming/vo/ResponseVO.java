package com.yzgaming.vo;

import java.io.Serializable;

public class ResponseVO implements Serializable{
    private static final long serialVersionUID = 8116817810829885862L;
    private int code;
    private String message;
    private Object data;

    public ResponseVO(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public ResponseVO(){

    }

    /**
     * 成功返回
     * @param object
     * @return
     */
    public static ResponseVO  getSuccess(Object object){
        ResponseVO responseVO=new ResponseVO();
        responseVO.setCode(200);
        responseVO.setMessage("调用成功");
        responseVO.setData(object);
        return  responseVO;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
