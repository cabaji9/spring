package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

/**
 * Created by Hyun Woo Son on 11/22/17.
 */
public class ScheduleBean {

    private static final Logger logger = LoggerFactory.getLogger(ScheduleBean.class);


    @Scheduled(fixedRate = 1000)
    public void play() {
        logger.info("title {} , artist {}, tracks {}");
    }
}
