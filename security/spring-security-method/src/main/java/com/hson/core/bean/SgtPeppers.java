package com.hson.core.bean;

import com.hson.core.vo.SongVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
public class SgtPeppers implements CompactDisc {

    private static final Logger logger = LoggerFactory.getLogger(SgtPeppers.class);

    private String title;
    private String artist;

    public SgtPeppers(){

    }

    public SgtPeppers(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Secured("ROLE_ADMIN")
    public void play()
    {
        logger.info("Play!");
        logger.info("Title {} and artist {}",title,artist);
    }


    @PreAuthorize("hasRole('ROLE_ADMIN') and #songVo.title.length() == 2")
    public void playSong(SongVo songVo){
        logger.info("song {}",songVo);
    }
}
