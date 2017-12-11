package com.hson.core;

import com.hson.core.bean.HelloWorldB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloConfig.class)
public class AppTest
{


    @Autowired
    private HelloWorldB helloWorldB;


    @Test
    public void testBean(){
        assertNotNull(helloWorldB);
    }

}
