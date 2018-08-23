package com.personal.spring.service;

import com.personal.spring.model.User;

import java.util.List;

/**
 * Created by Hyun Woo Son on 1/22/18
 **/

public interface HelloService {

    String getSalute(String name);

    void saveUser(User user);

    User getUserByUserName(String name);

    List<User> getAllUsers();

}
