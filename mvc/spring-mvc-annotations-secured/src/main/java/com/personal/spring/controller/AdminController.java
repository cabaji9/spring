package com.personal.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Hyun Woo Son on 7/6/18.
 */
@Controller
public class AdminController {

    private final Logger logger = LoggerFactory.getLogger(AdminController.class);


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        logger.debug("admin() executed");
        model.put("title","ADMIN PAGE");
        return "index";
    }
}
