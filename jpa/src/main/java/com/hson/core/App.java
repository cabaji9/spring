package com.hson.core;

import com.hson.core.dao.UserDao;
import com.hson.core.model.UserEntity;
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

        UserDao daoExample = ctx.getBean(UserDao.class);

        UserEntity userEntity = new UserEntity();
        userEntity.setName("uno");

         daoExample.insert(userEntity);


        List<UserEntity> list = daoExample.obtainUserEntityAll();
        logger.info("list is {}",list);



    }
}
