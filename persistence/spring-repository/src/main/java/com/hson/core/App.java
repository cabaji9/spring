package com.hson.core;

import com.hson.core.config.AppConfig;
import com.hson.core.dao.UserDao;
import com.hson.core.model.UserEntity;
import com.hson.core.repository.UseraRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {


    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        UserDao daoExample = (UserDao) ctx.getBean("userDaoImpl");

        UserEntity userEntity = new UserEntity();
        userEntity.setName("uno");

         daoExample.insert(userEntity);


        List<UserEntity> list = daoExample.obtainUserEntityAll();
        logger.info("list is {}",list);

        userEntity = new UserEntity();
        userEntity.setName("TRANSACTION UNO");

         UserDao userDaoTransactionImpl=(UserDao) ctx.getBean("userDaoTransactionImplTemplate");
        userDaoTransactionImpl.insert(userEntity);
        List<UserEntity> userEntityList = userDaoTransactionImpl.obtainUserEntityAll();
        logger.info("list is {}",userEntityList);


        UseraRepository repository = ctx.getBean(UseraRepository.class);

        userEntity = new UserEntity();
        userEntity.setName("lala");

        repository.save(userEntity);

         userEntityList =   repository.findAll();
        logger.info("list is {}",userEntityList);

        logger.info("count all {}",repository.countAll());

        logger.info("count by id 1 {}",repository.countById(1L));

        UserEntity userEntity1  =repository.findByName("lala");
        logger.info("find entity {}",userEntity1);
    }
}
