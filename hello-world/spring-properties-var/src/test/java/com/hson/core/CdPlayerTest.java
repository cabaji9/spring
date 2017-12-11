package com.hson.core;

import com.hson.core.bean.CompactDisc;
import com.hson.core.bean.SgtPeppers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CompactDiscConfig.class)
public class CdPlayerTest {


    private static final Logger logger = LoggerFactory.getLogger(CdPlayerTest.class);

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private Environment env;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDisc);
    }

    @Test
    public void testPlay(){
        compactDisc.play();
    }

    @Test
    public void testEnviroment(){
        String[] profiles=env.getActiveProfiles();
        logger.info("profiles : {}",profiles);

        String trackNumber = env.getProperty("track.number");
        logger.info("trackNumber : {}",trackNumber);

    }

}

