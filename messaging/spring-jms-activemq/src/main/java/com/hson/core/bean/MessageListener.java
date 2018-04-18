package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Hyun Woo Son on 4/11/18
 **/
public class MessageListener {

    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    public void echo(String string) {
       logger.info("GOT A MESSAGE:  " + string);
    }

}
