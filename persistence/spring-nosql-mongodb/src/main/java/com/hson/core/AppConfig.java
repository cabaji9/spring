package com.hson.core;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Hyun Woo Son on 11/14/17.
 */

@Configuration
@ComponentScan(basePackages = "com.hson")
@EnableMongoRepositories(basePackages = "com.hson")
public class AppConfig extends AbstractMongoConfiguration{


    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient();
    }

    protected String getDatabaseName() {
        return "myDb";
    }



    @Bean
    public MongoOperations mongoOperations() throws Exception{
        return  new MongoTemplate(mongo(),"myDb");

    }
}
