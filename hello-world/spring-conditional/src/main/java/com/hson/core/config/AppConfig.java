package com.hson.core.config;


import com.hson.core.bean.SgtPeppers;
import org.springframework.context.annotation.*;

/**
 * Created by Hyun Woo Son on 11/27/17.
 */
@Configuration
@ComponentScan({"com.hson.core.config.*"})
@PropertySource({"app.properties"})
public class AppConfig {



    @Bean
    @Conditional(MagicExistsCondition.class)
    public SgtPeppers getWithMagic(){
     return new SgtPeppers("with magic","with magic artist");
    }


    @Bean
    @Conditional(MagicNoExistsCondition.class)
    public SgtPeppers getWithoutMagic(){
        return new SgtPeppers("0 magic","no magic artist");
    }




}
