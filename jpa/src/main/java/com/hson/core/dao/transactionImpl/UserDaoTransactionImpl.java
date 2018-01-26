package com.hson.core.dao.transactionImpl;

import com.hson.core.dao.UserDao;
import com.hson.core.dao.impl.UserDaoImpl;
import com.hson.core.model.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

/**
 * Created by Hyun Woo Son on 1/15/18
 **/
@Component("userDaoTransactionImplTemplate")
@Qualifier("userDaoTransactionImplTemplate")
public class UserDaoTransactionImpl implements UserDao{


    private static final Logger logger = LoggerFactory.getLogger(UserDaoTransactionImpl.class);


    @Autowired
    private UserDao userDao;

    @Autowired
    private PlatformTransactionManager transactionManager;


    public void insert(final UserEntity userEntity) {
        TransactionTemplate template = new TransactionTemplate(transactionManager);

        template.execute(new  TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                try {
                    logger.info("start transaction");
                    userDao.insert(userEntity);
                    logger.info("end transaction");
                }
                catch(Exception e){
                    logger.error("Error {}",e.getMessage(),e);
                }

            }
        });


    }

    public List<UserEntity> obtainUserEntityAll() {

        TransactionTemplate template = new TransactionTemplate(transactionManager);
        return (List<UserEntity>) template.execute(new TransactionCallback<Object>() {

            public Object doInTransaction(TransactionStatus transactionStatus) {
                return userDao.obtainUserEntityAll();
            }
        });
    }
}
