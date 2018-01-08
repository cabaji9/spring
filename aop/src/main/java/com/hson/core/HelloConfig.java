package com.hson.core;

import com.hson.core.bean.HelloWorldB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Hyun Woo Son on 11/14/17.
 */

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldB obtainHelloWorldB(){
        HelloWorldB helloWorldB = new HelloWorldB();
        helloWorldB.setName("TEST ON BEAN");
        return helloWorldB;
    }




}
