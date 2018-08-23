package com.personal.spring.model;

/**
 * Created by Hyun Woo Son on 8/20/18.
 */
public class ErrorRest {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ErrorRest{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
