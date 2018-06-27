package com.personal.spring.controller;

import com.personal.spring.model.User;
import com.personal.spring.persistence.MockSingletonDatabase;
import com.personal.spring.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Hyun Woo Son on 1/22/18
 **/
@Controller
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private HelloService helloService;

    MockSingletonDatabase mockSingletonDatabase = MockSingletonDatabase.getInstance();


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        logger.debug("index() executed");
        model.put("title", helloService.getSalute("HAOAALALA"));
        return "index";
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {
        logger.debug("hello() is executed d- $name {}", name);
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("title", helloService.getSalute(name));
        return model;

    }


    @RequestMapping(value = "/hello-user/{name}", method = RequestMethod.GET)
    public ModelAndView helloUser(@PathVariable("name") String name) {

        logger.debug("hello() is executed - $name {}", name);
        User user = helloService.getUserByUserName(name);
        logger.debug("user = {}",user);
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("title", helloService.getSalute(name + " " + user.getLastName()));
        return model;

    }


}
