package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@Component
@Qualifier("ugly")
public class Ugly implements CompactDisc {

    private static final Logger logger = LoggerFactory.getLogger(Ugly.class);

    private String title="ugly";
    private String artist="ugliest";



    public void play()
    {
        logger.info("Play!");
        logger.info("Title {} and artist {}",title,artist);
    }
}
