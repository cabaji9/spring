package com.personal.spring.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by Hyun Woo Son on 1/24/18
 **/
public class Contact {

    @Size(max=4, message = "{no.size}")
    private String name;
   @Pattern(regexp = "^\\d+$", message = "{only.numbers}")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
