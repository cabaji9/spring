package com.hson.core;

import com.hson.core.bean.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CompactDiscConfig.class)
public class CdPlayerTest {

    @Autowired
    @Qualifier("sgtPepperSingleton")
    private CompactDisc compactDisc;

    @Autowired
    ApplicationContext context;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDisc);
    }

    @Test
    public void testPlay(){
        compactDisc.play();
    }

    @Test
    public void testCreationBean(){

        CompactDisc compactDisc=    context.getBean("sgtPepper",CompactDisc.class);
            compactDisc.play();

        CompactDisc compactDisc2=    context.getBean("sgtPepper",CompactDisc.class);
        compactDisc2.play();

        CompactDisc compactDisc3=    context.getBean("sgtPepper",CompactDisc.class);
        compactDisc3.play();

    }

    @Test
    public void testCreationBeanSingleTon(){

        CompactDisc compactDisc=    context.getBean("sgtPepperSingleton",CompactDisc.class);
        compactDisc.play();

        CompactDisc compactDisc2=    context.getBean("sgtPepperSingleton",CompactDisc.class);
        compactDisc2.play();

        CompactDisc compactDisc3=    context.getBean("sgtPepperSingleton",CompactDisc.class);
        compactDisc3.play();

    }



}

