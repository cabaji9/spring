package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * This bean is create programatically
 * Created by Hyun Woo Son on 11/9/17.
 */
@Component
public class HelloWorldB {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldB.class);

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        logger.info("Hola mundo a : " + this.name);
    }

    public void sayHelloParam(String name){
        logger.info("hola mundo a : "+ name);
    }

    public String returnHello(String name){
        return name;
    }


    public void launchException() throws Exception{
        throw new Exception("launched exception");
    }
}
