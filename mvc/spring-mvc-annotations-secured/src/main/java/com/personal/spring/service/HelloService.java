package com.personal.spring.service;

import com.personal.spring.model.User;
import com.personal.spring.persistence.MockSingletonDatabase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Hyun Woo Son on 1/22/18
 **/
@Service
public class HelloService {

    MockSingletonDatabase mockSingletonDatabase = MockSingletonDatabase.getInstance();

    private static final Logger logger = LoggerFactory.getLogger(HelloService.class);


    public String getSalute(String name){
        return "Hello World "+ name;
    }


    public void saveUser(User user){
        mockSingletonDatabase.put(user.getFirstName(), user);
    }

    public User getUserByUserName(String name){
        return (User) mockSingletonDatabase.get(name);
    }

}
