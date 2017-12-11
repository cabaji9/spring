package com.hson.core.bean;

import com.hson.core.qualifier.MoreUglyThanElse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@Component
@MoreUglyThanElse
public class Soso implements CompactDisc {

    private static final Logger logger = LoggerFactory.getLogger(Soso.class);

    private String title="so so ugly";
    private String artist="ugliest";



    public void play()
    {
        logger.info("Play!");
        logger.info("Title {} and artist {}",title,artist);
    }
}
