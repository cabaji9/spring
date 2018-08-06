package com.hson.core;

import com.hson.core.bean.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

/**
 * Created by Hyun Woo Son on 11/14/17.
 */

@Configuration
@ComponentScan(basePackages = "com.hson")
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class AppConfig extends GlobalMethodSecurityConfiguration {


    @Bean
    public SgtPeppers getCompactDisc(){
        return new SgtPeppers("1","2");
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().withUser("user").password("password").roles("ADMIN");
    }
}
