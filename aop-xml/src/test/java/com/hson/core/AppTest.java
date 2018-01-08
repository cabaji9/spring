package com.hson.core;


import com.hson.core.bean.Thinker;
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
    private Thinker thinker;

    @Test
    public void test(){

        thinker.thinkOfSomething("UAKALASDF");
    }


}
