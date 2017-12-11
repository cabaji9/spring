package com.hson.core;

import com.hson.core.bean.CompactDisc;
import com.hson.core.config.AppConfig;
import com.hson.core.config.CompactDiscConfigDev;
import com.hson.core.config.CompactDiscConfigProd;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class, CompactDiscConfigDev.class, CompactDiscConfigProd.class})
@ActiveProfiles("prod")
public class CdPlayerTest {

    @Autowired
    private CompactDisc compactDisc;


    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDisc);
    }

    @Test
    public void testPlay(){
        compactDisc.play();
    }
}

