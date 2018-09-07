package org.hson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hyun Woo Son on 8/31/18.
 */

@RestController
public class RestBootController {


    @RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
