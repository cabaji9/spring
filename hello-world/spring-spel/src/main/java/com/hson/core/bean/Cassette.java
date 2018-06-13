package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 12/5/17.
 */
@Component("cassette_old")
public class Cassette {

    private static final Logger logger = LoggerFactory.getLogger(Cassette.class);


    private String slowsong = "slow song!";

    private String isNullValue = null;

    public Integer casseteTime = 90;

    public void playSlowly(){
        logger.info("play song {}",slowsong);

    }


    public String getSlowsong() {
        return slowsong;
    }

    public void setSlowsong(String slowsong) {
        this.slowsong = slowsong;
    }


    public String getIsNullValue() {
        return isNullValue;
    }

    public void setIsNullValue(String isNullValue) {
        this.isNullValue = isNullValue;
    }
}
