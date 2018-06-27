package com.personal.spring.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Hyun Woo Son on 6/26/18
 **/
@ControllerAdvice
public class AppWideExcepctionHandler {

    private final Logger logger = LoggerFactory.getLogger(AppWideExcepctionHandler.class);


    @ExceptionHandler(LastNameNotValidException.class)
    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
        logger.error("Request : " + req.getRequestURL() + " raised last name" + ex);
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", ex);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error/exception");
        return mav;
    }

}
