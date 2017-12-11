package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@Component("sgtPepperSingleton")
public class SgtPeppersSingleTon implements CompactDisc {

    private static final Logger logger = LoggerFactory.getLogger(SgtPeppersSingleTon.class);

    private String title="SINGLETON";
    private String artist="SINGLETON";



    public SgtPeppersSingleTon(){
        try{
        title += new Date();
        Thread.sleep(1000);
        logger.info("NEW TITLE IS {}",title);}
        catch(Exception e){
            logger.error(e.getMessage(),e);
        }
    }

    public void play()
    {
        logger.info("Play!");
        logger.info("Title {} and artist {}",title,artist);
    }
}
