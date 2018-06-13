package com.hson.core;

import com.hson.core.aop.LogginAspect;
import com.hson.core.aop.LoggingAspectPerformance;
import com.hson.core.bean.Performance;
import com.hson.core.bean.PerformanceBean;
import com.hson.core.introduction.EncoreableIntroducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Hyun Woo Son on 11/14/17.
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.hson")
public class AppConfig {

    @Bean
    public LogginAspect getLogginAspect(){
        return new LogginAspect();
    }

    @Bean
    public LoggingAspectPerformance getLogginAspectPerformance(){
        return new LoggingAspectPerformance();
    }

    @Bean
    public EncoreableIntroducer getEncoreableIntroducer(){
        return new EncoreableIntroducer();
    }






}
