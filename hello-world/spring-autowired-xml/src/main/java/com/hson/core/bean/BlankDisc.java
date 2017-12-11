package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Hyun Woo Son on 11/22/17.
 */
public class BlankDisc implements CompactDisc {

    private static final Logger logger = LoggerFactory.getLogger(BlankDisc.class);

    private String title;
    private String artist;

    private List<String> tracks;

    public BlankDisc(String title, String artist,List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        logger.info("title {} , artist {}, tracks {}",title,artist,tracks);
    }
}
