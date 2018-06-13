package com.hson.core;

import com.hson.core.bean.BlankDisc;
import org.junit.BeforeClass;
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
public class CdPlayerTest {

   @Autowired
   private BlankDisc blankDisc;


   @BeforeClass
   public static void  beforeClass(){
       System.setProperty("secret","superSecretKey");

    }


    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(blankDisc);


    }


    @Test
    public void testPlay(){
        blankDisc.play();
    }



}

