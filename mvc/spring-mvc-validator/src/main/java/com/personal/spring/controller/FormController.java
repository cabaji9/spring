package com.personal.spring.controller;

import com.personal.spring.model.User;
import com.personal.spring.persistence.MockSingletonDatabase;
import com.personal.spring.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by Hyun Woo Son on 6/13/18
 **/
@Controller
public class FormController {

    private final Logger logger = LoggerFactory.getLogger(FormController.class);


    private HelloService helloService;

    @Autowired
    public FormController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping(value = "/form")
    public String redirectToForm() {
        return "form";

    }


    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String processRegister(@Valid User user,Errors errors, Map<String, Object> model ) {
        if(errors.hasErrors()){
            logger.info("error!");
            model.put("dataError",errors.getAllErrors());
            return "form";
        }


        helloService.saveUser(user);
        logger.info("processRegister | user {}",user);
        return "redirect:/hello-user/" + user.getFirstName();
    }

}
