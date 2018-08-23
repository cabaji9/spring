package com.personal.spring.controller;

import com.personal.spring.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Hyun Woo Son on 8/22/18.
 */
@RestController
@RequestMapping("/restTemplate")
public class RestTemplateController {

    private final Logger logger = LoggerFactory.getLogger(RestTemplateController.class);

    @Value("${url.value}")
    private String url;


    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<User> getAllTemplate(){
        logger.info("getAllTemplate | Get all Users with url {}",url);
        RestTemplate rest = new RestTemplate();
        List<User> userList =rest.getForObject(url+"rest/getAll",List.class);

        logger.info("getAllTemplate | all users {}",userList);

        return userList;
    }


    @RequestMapping(value = "/getAllExchange",method = RequestMethod.GET)
    public List<User> getAllTemplateExchange(){
        logger.info("getAllTemplateExchange | Get all Users with url {}",url);
        RestTemplate rest = new RestTemplate();


        MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();
        headers.add("Accept","application/json");
        HttpEntity<Object> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<List<User>> responseEntity =rest.exchange(url+"rest/getAll",HttpMethod.GET,requestEntity,new ParameterizedTypeReference<List<User>>(){});
        logger.info("response : {}" ,responseEntity.getStatusCode());
        List<User> userList =  responseEntity.getBody();
        logger.info("getAllTemplate | all users {}",userList);

        return userList;
    }


}
