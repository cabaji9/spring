package com.hson.core.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by Hyun Woo Son on 4/11/18
 **/
@Component
public class Sender {


    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    @Qualifier("queue")
    Destination  queue;

    @Autowired
    @Qualifier("queue2")
    Destination  queue2;



    public void sendMsg(final String msg){

        jmsTemplate.send(queue, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                Message message = session.createObjectMessage(msg);
                return message;
            }
        });



    }


    public void sendMsg2(final String msg){
        jmsTemplate.send(queue2, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                Message message = session.createObjectMessage(msg);
                return message;
            }
        });
    }






}
