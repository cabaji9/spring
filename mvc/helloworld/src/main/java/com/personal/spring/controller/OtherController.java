package com.personal.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by Hyun Woo Son on 1/23/18
 **/
@Controller
@RequestMapping(value = "/other")
public class OtherController {



    @RequestMapping(method = RequestMethod.GET)
    public String obtainNames(Map<String,Object> model){
        model.put("otherList", Arrays.asList("uno","dos","tres"));
        return "other";
    }
}
