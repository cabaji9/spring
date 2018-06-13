package com.hson.core;

import com.hson.core.bean.ProfileMethod;
import com.hson.core.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@ActiveProfiles("prod")
public class ProfileMethodTest {

    private static final Logger logger = LoggerFactory.getLogger(ProfileMethodTest.class);


    @Autowired
    private ProfileMethod profileMethod;


    @Test
    public void testProfileProd() {
        String value = profileMethod.getValue();
        assertTrue(value.equals("prod"));
        logger.info(value);
    }


}

