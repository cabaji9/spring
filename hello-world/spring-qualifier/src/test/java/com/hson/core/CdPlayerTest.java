package com.hson.core;

import com.hson.core.bean.CompactDisc;
import com.hson.core.qualifier.MoreUglyThanElse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("ugly")
    private CompactDisc compactDisc;


    @Autowired
    @MoreUglyThanElse
    private CompactDisc moreUglyDisc;






    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDisc);

    }


    @Test
    public void testPlay(){
        compactDisc.play();
        moreUglyDisc.play();
    }

}

