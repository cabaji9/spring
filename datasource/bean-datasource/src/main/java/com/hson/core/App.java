package com.hson.core;

import com.hson.core.dao.DaoExample;
import com.hson.core.dao.SimpleJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {


    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");

        DaoExample daoExample = ctx.getBean(DaoExample.class);

        List<String> names = daoExample.obtainNames();
        logger.info("names obtained {}", names);


        SimpleJdbcDao simpleJdbcDao = (SimpleJdbcDao) ctx.getBean("simpleJdbcDao");

        simpleJdbcDao.insert(5, "NUEVO");


        names = simpleJdbcDao.getNames();
        logger.info("names obtained jdbc {}", names);

    }
}
