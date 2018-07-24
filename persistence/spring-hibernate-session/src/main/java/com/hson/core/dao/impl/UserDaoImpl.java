package com.hson.core.dao.impl;

import com.hson.core.App;
import com.hson.core.dao.UserDao;
import com.hson.core.model.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Hyun Woo Son on 1/8/18
 **/

@Repository
@Transactional
@Qualifier("userDaoImpl")
public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Autowired
    SessionFactory sessionFactory;




    public void insert(UserEntity userEntity) {
        currentSession().save(userEntity);
        logger.info("persisted {}",userEntity);

    }

    public List<UserEntity> obtainUserEntityAll() {
        return currentSession().createQuery("select c from UserEntity c").list();
    }

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
}
