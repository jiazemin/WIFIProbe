package com.codingfairy.utils.constant;

/**
 * Server system error code definition
 * @author cuihao
 */
public enum ServerCode {

    SUCCESS(1000,"ok"),
    USER_NOT_FOUND(1001,"Cannot find user, make sure you have registered."),
    ERROR_PASSWORD(1002,"Error password, please check again."),
    PARAM_FORMAT(1003,"Unsupported param format.");

    private int code;
    private String msg;
    ServerCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}