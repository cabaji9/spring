package com.hson.core;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Hyun Woo Son on 1/16/18
 **/
public class TestWatcherUtilMethodName extends TestWatcher {

    private static Logger logger = LoggerFactory.getLogger(TestWatcherUtilMethodName.class);

    protected void starting(Description description) {
        logger.info("\n\n********Iniciando prueba:  {} ************\n ", description.getMethodName());
    }


}
