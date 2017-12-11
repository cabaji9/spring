package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@Component("sgtPepper")
public class SgtPeppers implements CompactDisc {

    private static final Logger logger = LoggerFactory.getLogger(SgtPeppers.class);

    private String title="LALA";
    private String artist="LASPDOAI";

    @Autowired
    Environment env;

    @Value("${track.number}")
    private String track;


    public void play()
    {

        title = env.getProperty("title");
        artist = env.getProperty("artist");

        logger.info("Play!");
        logger.info("Title {} and artist {}",title,artist);
        logger.info("track es :{}",track);

        logger.info("track es by env :{}",env.getProperty("track.number"));
    }
}
