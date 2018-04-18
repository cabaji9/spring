package com.hson.core.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.ObjectMessage;

/**
 * Created by Hyun Woo Son on 4/11/18
 **/
@Component
public class Receiver {

    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    @Qualifier("queue")
    Destination queue;


    public void receive(){

        try {
            ObjectMessage receivedMsg = (ObjectMessage) jmsTemplate.receive(queue);

            logger.info("receivedMsg: {}", receivedMsg.getObject());
        }
        catch(Exception e){
            logger.error(e.getMessage(),e);
        }




    }
}
