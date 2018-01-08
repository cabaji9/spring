package com.hson.core.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 12/18/17
 **/
@Component
public class Magician implements MindReader {

    private static final Logger logger = LoggerFactory.getLogger(Magician.class);

    private String thoughts;


    public void interceptThoughts(String thoughts) {
        logger.info("THOUGHTS INTERCEPTED : {}",thoughts);
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return this.thoughts;
    }
}
