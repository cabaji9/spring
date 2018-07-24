package com.hson.core;


import com.hson.core.dao.UserDao;
import com.hson.core.model.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springbeans.xml"})
public class AppTest

{

    private static final Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Autowired
    @Qualifier("userDaoTransactionImplTemplate")
    private UserDao userDaoTransaction;

    @Test
    public void test() {

        UserEntity userEntity = new UserEntity();
        userEntity.setName("DOS");

        userDao.insert(userEntity);


        List<UserEntity> userEntityList = userDao.obtainUserEntityAll();
        logger.info("list is {}", userEntityList);

        assertTrue(userEntityList.size() == 1);

    }


    @Test
    public void testTransaction() {

        UserEntity userEntity = new UserEntity();
        userEntity.setName("TRES");

        userDaoTransaction.insert(userEntity);
        List<UserEntity> userEntityList = userDaoTransaction.obtainUserEntityAll();
        logger.info("list is {}", userEntityList);

        assertTrue(userEntityList.size() == 2);

    }


}
