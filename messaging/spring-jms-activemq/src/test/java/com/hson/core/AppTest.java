package com.hson.core;

import com.hson.core.bean.Receiver;
import com.hson.core.bean.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springbeans.xml"})
public class AppTest
{


    @Autowired
    private Sender sender;

    @Autowired
    private Receiver receiver;


    @Test
    public void testBean(){

        sender.sendMsg("hola");

        receiver.receive();

    }

    @Test
    public void testBeanMsg2(){

        sender.sendMsg2("hola 2");

    }

}
