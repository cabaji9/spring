package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@Component
@Qualifier("nice")
public class SgtPeppers implements CompactDisc {

    private static final Logger logger = LoggerFactory.getLogger(SgtPeppers.class);

    private String title="nice";
    private String artist="nicest";



    public void play()
    {
        logger.info("Play!");
        logger.info("Title {} and artist {}",title,artist);
    }
}
