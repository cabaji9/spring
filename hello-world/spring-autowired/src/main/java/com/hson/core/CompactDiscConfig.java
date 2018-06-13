package com.hson.core;

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
@ComponentScan(basePackages = "com.hson")
public class CompactDiscConfig {


    @Bean
    public SgtPeppers getCompactDisc(){
        return new SgtPeppers("1","2");
    }


}
