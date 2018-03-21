package com.hson.core.pojo;

import java.io.Serializable;

/**
 * Created by Hyun Woo Son on 3/19/18
 **/
public class RmiVo implements Serializable {

    private String name;
    private String data;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "RmiVo{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
