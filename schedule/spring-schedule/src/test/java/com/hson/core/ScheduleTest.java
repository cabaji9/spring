package com.hson.core;

import com.hson.core.bean.ScheduleBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springbeans.xml"})
public class ScheduleTest {

    //autowiring with different implementations
  @Autowired
  private ScheduleBean scheduleBean;


    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(scheduleBean);
    }

    @Test
    public void testSchedule(){
        try{
            Thread.sleep(10000000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }




}

''