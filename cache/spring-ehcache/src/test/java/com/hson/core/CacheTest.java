package com.hson.core;

import com.hson.core.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class CacheTest {

    private static final Logger logger = LoggerFactory.getLogger(CacheTest.class);

    @Autowired
    private BookRepository bookRepository;


    @Test
    public void  testWithoutCache(){
      logger.info("{}",bookRepository.getByIsbn("lala"));
        logger.info("{}",  bookRepository.getByIsbn("lolo"));
        logger.info("{}",  bookRepository.getByIsbn("lala"));

    }


    @Test
    public void  testWithCache(){
        logger.info("{}", bookRepository.getByIsbnCache("lala"));
        logger.info("{}", bookRepository.getByIsbnCache("lolo"));
        logger.info("{}", bookRepository.getByIsbnCache("lala"));
        logger.info("{}", bookRepository.getByIsbnCache("lolo"));
    }



}

