package com.personal.spring.controller;

import com.personal.spring.exception.UserNotFoundException;
import com.personal.spring.model.ErrorRest;
import com.personal.spring.model.User;
import com.personal.spring.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;

/**
 * Created by Hyun Woo Son on 6/13/18
 **/
@RestController
@RequestMapping("/rest")
public class RestExampleController {

    private final Logger logger = LoggerFactory.getLogger(RestExampleController.class);


    private HelloService helloService;

    @Autowired
    public RestExampleController(HelloService helloService) {
        this.helloService = helloService;
    }


    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<User> getAll(){
        logger.info("getAll | Get all Users");
        return helloService.getAllUsers();
    }

    @RequestMapping(value = "/getAllResponse",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllResponse(){
        return getAll();
    }


    @RequestMapping(value="/save",method = RequestMethod.POST)
    public void update(@RequestBody  User user){
        helloService.saveUser(user);
    }


    @RequestMapping(value= "/findByName/{name}",method = RequestMethod.GET)
    public ResponseEntity findbyName(@PathVariable String name){
        logger.info("findbyName | name  {}",name);
        User user = helloService.getUserByUserName(name);
        if(user == null){
            return obtainError("User not found {0}",name);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }



    @RequestMapping(value= "/findByNameException/{name}",method = RequestMethod.GET)
    public User findbyNameException(@PathVariable String name){
        logger.info("findbyName | name  {}",name);
        User user = helloService.getUserByUserName(name);
        if(user == null){
            throw new UserNotFoundException("User not found {0}",name);
        }
        return user;
    }


    private ResponseEntity<ErrorRest> obtainError(String msg, Object... vars){
        ErrorRest errorRest = new ErrorRest();
        errorRest.setMsg(MessageFormat.format(msg,vars));
        return new ResponseEntity<>(errorRest,HttpStatus.BAD_REQUEST);
    }


    @RequestMapping(value= "/obtainHeaders",method = RequestMethod.GET)
    public ResponseEntity findbyNameHeaders(){
        logger.info("findbyNameHeaders");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("newHeader","ohYeah!");

        return new ResponseEntity<>("works!",httpHeaders, HttpStatus.OK);
    }



}
