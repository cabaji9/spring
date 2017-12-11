package com.hson.core;


import com.hson.core.bean.CompactDisc;
import com.hson.core.config.AppConfig;
import com.hson.core.config.CompactDiscConfigDev;
import com.hson.core.config.CompactDiscConfigProd;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //Enable a "live" profile
        context.getEnvironment().setActiveProfiles("dev");
        context.register(AppConfig.class, CompactDiscConfigProd.class, CompactDiscConfigDev.class);
        context.refresh();

        CompactDisc compactDisc =context.getBean(CompactDisc.class);
        compactDisc.play();


        CompactDisc compactDisc1 =(CompactDisc)    context.getBean("sgtPepperDisc");
        compactDisc1.play();




        ((ConfigurableApplicationContext) context).close();

    }
}
