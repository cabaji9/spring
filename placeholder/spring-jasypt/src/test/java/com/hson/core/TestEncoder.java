package com.hson.core;

import com.hson.core.bean.BlankDisc;
import com.hson.core.security.ValueEncoderDecoder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Hyun Woo Son on 4/18/18
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springbeans.xml"})
public class TestEncoder {

    private static final Logger logger = LoggerFactory.getLogger(BlankDisc.class);


    @Autowired
    private ValueEncoderDecoder valueEncoderDecoder;


    @Test
    public void testEncoder(){
        String code = valueEncoderDecoder.encode("secreto");

        logger.info("code: {}",code);


        logger.info("decode: {}",valueEncoderDecoder.decode(code));




    }
}
