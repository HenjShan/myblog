package com.hanshan.myblog.admin.commons;

public enum  StatusCodeUtils {

    LOGIN_SUCCESS("5000","登录成功"),
    LOGIN_DEFEAT("5001","登录失败");

    private String code;
    private String msg;

    StatusCodeUtils(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
