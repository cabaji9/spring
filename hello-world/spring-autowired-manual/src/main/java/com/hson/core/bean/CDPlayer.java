package com.hson.core.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Auto wires the compact disc on the constructor.
 * Created by Hyun Woo Son on 11/20/17.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }


    public void play() {
        cd.play();

    }
}
