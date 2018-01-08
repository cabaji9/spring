package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 12/11/17
 **/
@Component
public class Performance {

    private static final Logger logger = LoggerFactory.getLogger(Performance.class);


    public void perform(){

        logger.info("PERFORM!!!");

    }


    public void sing(int songnumber){
        logger.info("song number {}",songnumber);
    }
}
