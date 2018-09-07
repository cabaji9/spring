package org.hson.controller;

import org.hson.model.User;
import org.hson.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Hyun Woo Son on 8/31/18.
 */

@RestController
public class RestBootController {

    private static final Logger logger = LoggerFactory.getLogger(RestBootController.class);

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @PostMapping("/save")
    public void save(@RequestBody User user){
        logger.debug("save {}",user);
        userRepository.save(user);
    }

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return (List<User>)userRepository.findAll();
    }

    @RequestMapping("/findByName")
    public List<User> findbyName(String name){
        logger.debug("name {}",name);
        return userRepository.findUserByName(name);
    }
}
