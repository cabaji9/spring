package com.personal.spring.controller;

import com.personal.spring.mock.persistence.MockSingletonDatabase;
import com.personal.spring.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Date;

/**
 * Created by Hyun Woo Son on 1/22/18
 **/
@Controller
@RequestMapping("/")
public class AppController {

    private final static Logger logger = LoggerFactory.getLogger(AppController.class);


    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }

    @RequestMapping(value = { "/products"}, method = RequestMethod.GET)
    public String productsPage(ModelMap model) {
        return "products";
    }

    @RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
    public String contactUsPage(Model model) {

        model.addAttribute(new Contact());
        return "contactus";
    }

    @RequestMapping(value = { "/contacted/{id}"}, method = RequestMethod.GET)
    public String contactedPage(@PathVariable String id, Model model) {
        model.addAttribute(MockSingletonDatabase.getInstance().get(id));
        return "contacted";
    }


    @RequestMapping(method = RequestMethod.POST,value = { "/contactus"})
    public String addContactToForm(@Valid Contact contact, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "contactus";
        }


        logger.info("saved {}",contact);
        String id = "contact"+new Date();
        MockSingletonDatabase.getInstance().put(id,contact);
        return "redirect:/contacted/"+id;
    }



}
