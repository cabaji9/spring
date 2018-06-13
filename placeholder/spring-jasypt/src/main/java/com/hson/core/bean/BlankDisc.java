package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Created by Hyun Woo Son on 11/22/17.
 */
public class BlankDisc  {

    private static final Logger logger = LoggerFactory.getLogger(BlankDisc.class);

    @Value("${title}")
    private String title;
    @Value("${artist}")
    private String artist;
    private String song;


    private String album;

    @Value("${album.password}")
    private String albumPassword;



    public void play() {
        logger.info("title {} , artist {},song {},album {},albumPassword {}",title,artist,song,album,albumPassword);
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }


}
