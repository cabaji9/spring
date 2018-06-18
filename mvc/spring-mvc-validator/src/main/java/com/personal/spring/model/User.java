package com.personal.spring.model;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * Created by Hyun Woo Son on 6/14/18
 **/
public class User {

    @NotNull
    @Size(min = 1,max=50)
    private String firstName;

    @NotNull
    @Size(min =2 ,max=50)
    private String lastName;

    @Max(9999)
    private Integer number;

    @Pattern(regexp = "^[0-9]*$")
    private String phone;

    @Email
    private String mail;

    @Past
    @DateTimeFormat(pattern = "mm-dd-yyyy")
    private Date birthday;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
