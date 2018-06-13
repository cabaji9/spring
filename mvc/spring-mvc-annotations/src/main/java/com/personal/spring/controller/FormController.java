package com.personal.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hyun Woo Son on 6/13/18
 **/
@Controller
public class FormController {

    @RequestMapping(value = "/form")
    public String redirectToForm(){
        return "form";

    }

}
