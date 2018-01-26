package com.personal.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Hyun Woo Son on 1/22/18
 **/
@Service
public class HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloService.class);


    public String getSalute(String name){
        return "Hello World "+ name;
    }

}
