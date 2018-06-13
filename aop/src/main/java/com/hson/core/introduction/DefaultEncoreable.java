package com.hson.core.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 6/1/18
 **/
@Component
public class DefaultEncoreable implements EncoreableInterface {

    private static final Logger logger = LoggerFactory.getLogger(DefaultEncoreable.class);

    public void performEncore() {
        logger.info("perform Encore!!!!");
    }
}
