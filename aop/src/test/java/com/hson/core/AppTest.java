package com.hson.core;

import com.hson.core.bean.HelloWorldB;
import com.hson.core.bean.Performance;
import com.hson.core.bean.PerformanceBean;
import com.hson.core.introduction.EncoreableInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppTest
{

    @Autowired
    private Performance performanceBean;

    @Autowired
    private HelloWorldB helloWorldB;




    @Test
    public void testPerformance(){

        performanceBean.sing(1);
        performanceBean.perform();


        EncoreableInterface encoreableInterface =    (EncoreableInterface)performanceBean;
        encoreableInterface.performEncore();


    }

    @Test
    public void testHelloWorldB(){
        helloWorldB.sayHello();
    }

}
