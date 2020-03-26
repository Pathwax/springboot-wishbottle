package com.hust25.wishbottle.util;


public class DataModel {

    private Integer code = 200;
    private String errorMsg = null;
    private Object data = null;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }


    public String getErrormsg() {
        return errorMsg;
    }

    public void setErrormsg(String errormsg) {
        this.errorMsg = errormsg;

    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
