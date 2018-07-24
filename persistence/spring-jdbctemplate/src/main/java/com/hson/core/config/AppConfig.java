package com.hson.core.config;

import com.hson.core.dao.SimpleJdbcDao;
import com.hson.core.dao.TransactionManagerDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

/**
 * Created by Hyun Woo Son on 7/11/18.
 */
@Configuration
@ComponentScan("com.hson")
public class AppConfig {


    @Bean
    public DataSource getDataSource()
    {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:h2:~/name");
        ds.setUsername("sa");
        ds.setPassword("");
        ds.setDriverClassName("org.h2.Driver");
        return ds;
    }



    @Value("classpath:testdb/schema.sql")
    private Resource schemaScript;

    @Value("classpath:testdb/data.sql")
    private Resource dataScript;

    @Bean
    public DataSourceInitializer dataSourceInitializer(final DataSource dataSource) {
        final DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(dataSource);
        initializer.setDatabasePopulator(databasePopulator());
        return initializer;
    }

    private DatabasePopulator databasePopulator() {
        final ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(schemaScript);
        populator.addScript(dataScript);
        return populator;
    }


    @Bean(name = "simpleJdbcDao")
    public SimpleJdbcDao getSimpleJdbcDao(DataSource dataSource){
        SimpleJdbcDao simpleJdbcDao = new SimpleJdbcDao();
        simpleJdbcDao.setDataSource(dataSource);
        return simpleJdbcDao;
    }

    @Bean
    public DataSourceTransactionManager getTransactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

    @Bean
    public TransactionManagerDao getTransactionManagerDao(DataSource dataSource){
        TransactionManagerDao transactionManagerDao = new TransactionManagerDao();
        transactionManagerDao.setDataSource(dataSource);
        return transactionManagerDao;

    }

    @Bean
    public JdbcTemplate getjdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }


}
