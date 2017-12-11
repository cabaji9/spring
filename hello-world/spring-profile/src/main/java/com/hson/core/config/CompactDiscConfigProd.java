package com.hson.core.config;

import com.hson.core.bean.CompactDisc;
import com.hson.core.bean.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Hyun Woo Son on 11/14/17.
 */

@Configuration
@Profile("prod")
public class CompactDiscConfigProd {


    @Bean
    public CompactDisc getCompactDisc(){
        return new SgtPeppers("prod","prodArtist");
    }



}
