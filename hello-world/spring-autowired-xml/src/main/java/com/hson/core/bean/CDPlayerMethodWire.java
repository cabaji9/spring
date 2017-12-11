package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Auto wires the compact disc on the constructor.
 * Created by Hyun Woo Son on 11/20/17.
 */
public class CDPlayerMethodWire implements MediaPlayer {

    private static final Logger logger = LoggerFactory.getLogger(CDPlayerMethodWire.class);

    private CompactDisc cd;

    private String method;

    @Autowired
    public void setCd(CompactDisc cd){
        this.cd = cd;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void play() {
        logger.info("pplay from cd playermethod wire and method {}" ,method);
        cd.play();

    }
}
