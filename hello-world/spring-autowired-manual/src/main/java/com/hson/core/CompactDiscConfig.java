package com.hson.core;

import com.hson.core.bean.CDPlayer;
import com.hson.core.bean.CompactDisc;
import com.hson.core.bean.MediaPlayer;
import com.hson.core.bean.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Hyun Woo Son on 11/14/17.
 */

@Configuration
public class CompactDiscConfig {


    @Bean
    public CompactDisc getCompactDisc(){
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer getCdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

}
