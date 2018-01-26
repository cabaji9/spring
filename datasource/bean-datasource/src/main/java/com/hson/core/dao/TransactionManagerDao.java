package com.hson.core.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

/**
 * Created by Hyun Woo Son on 1/11/18
 **/
@Component
public class TransactionManagerDao extends SimpleJdbcDao {

    private static final Logger logger = LoggerFactory.getLogger(DaoExample.class);

    @Autowired
    @Qualifier("transactionManager")
    private PlatformTransactionManager platformTransactionManager;


    @Override
    public void insert(Integer id, String name) {
        TransactionDefinition tx = new DefaultTransactionDefinition();
        TransactionStatus txStatus = platformTransactionManager.getTransaction(tx);

        try {

            super.insert(id, name);
            platformTransactionManager.commit(txStatus);
            logger.debug("INGRESADO EXITOSO");
        }
        catch(Exception e){
            logger.error("TransactionManagerDao | error {}",e.getMessage(),e);
            platformTransactionManager.rollback(txStatus);

        }
    }
}
