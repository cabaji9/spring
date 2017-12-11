package com.hson.core.config;

import com.hson.core.bean.CompactDisc;
import com.hson.core.bean.SgtPeppers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Hyun Woo Son on 11/14/17.
 */

@Configuration
@Profile("dev")
public class CompactDiscConfigDev {


    @Bean(name = "sgtPepperDisc")
    public CompactDisc getCompactDisc(){
        return new SgtPeppers("dev","devArtist");
    }




}
