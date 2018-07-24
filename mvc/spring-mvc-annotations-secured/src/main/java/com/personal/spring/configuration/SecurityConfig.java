package com.personal.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Hyun Woo Son on 7/5/18.
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and().
                withUser("admin").password("password").roles("USER","ADMIN");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
       web.ignoring().antMatchers("/resources/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests().
               antMatchers("/admin").hasRole("ADMIN").
               anyRequest().authenticated().and().formLogin().and().httpBasic().and().logout().logoutSuccessUrl("/");
    }
}
