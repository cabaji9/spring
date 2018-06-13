package com.hson.core.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 5/15/18
 **/
@Component
public class ProfileMethod {

    private String value;


    public ProfileMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
