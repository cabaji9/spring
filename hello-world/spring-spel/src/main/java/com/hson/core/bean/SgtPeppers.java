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

    @Value("#{3.14}")
    private Double piValue;

    @Value("#{T(java.lang.Math).PI}")
    private Double realPi;


    @Value("#{cassette_old.getSlowsong().toUpperCase()}")
    private String casseteSong;

    @Value("#{cassette_old.getIsNullValue()?.toUpperCase()}")
    private String isNullValue;


    @Value("#{cassette_old.casseteTime == 90?'Long':'short'}")
    private String casseteTime;

    @Value("#{T(System).currentTimeMillis()}")
    private Long currentTime;


    @Autowired
    Environment env;

    @Value("#{systemProperties['track.number']}")
    private String track;


    public void play()
    {

        title = env.getProperty("title");
        artist = env.getProperty("artist");

        logger.info("Play!");
        logger.info("Title {} and artist {}",title,artist);
        logger.info("track es :{}",track);

        logger.info("track es by env :{}",env.getProperty("track.number"));

        logger.info("Pi is {}",piValue);

        logger.info("CASSETE SONG IS {}",casseteSong);

        logger.info("REal Pi is {}",realPi);

        logger.info("Cassete time is {}",casseteTime);

        logger.info("current time {}",currentTime);

        logger.info("isNulll value {}",isNullValue);
    }
}
