package com.hson.core.config;


import com.hson.core.bean.CompactDisc;
import com.hson.core.bean.ProfileMethod;
import com.hson.core.bean.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Hyun Woo Son on 11/27/17.
 */
@Configuration
@ComponentScan({"com.hson.core.config.*"})
public class AppConfig {

//    @Bean
//    @Profile("dev")
//    public CompactDisc getCompactDisc(){
//        return new SgtPeppers("dev","devArtist");
//    }
//
//    @Bean
//    @Profile("prod")
//    public CompactDisc getCompactDiscTwo(){
//        return new SgtPeppers("prod","prodArtist");
//    }


    @Bean
    @Profile("dev")
    public ProfileMethod getProfileMethod() {
        return new ProfileMethod("dev");
    }

    @Bean
    @Profile("prod")
    public ProfileMethod getProfileMethodProd() {
        return new ProfileMethod("prod");
    }


}
