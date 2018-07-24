package com.hson.core.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hyun Woo Son on 1/3/18
 **/
@Component
public class DaoExample {

    private static final Logger logger = LoggerFactory.getLogger(DaoExample.class);

    @Autowired
    private DataSource dataSource;



    public List<String> obtainNames(){
        List<String> names = new ArrayList<String>();
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from usera");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

               String name= rs.getString("NAMEM");
               names.add(name);
               logger.info("added name {}",name);
            }
            rs.close();
            ps.close();
            connection.close();
        }
        catch (Exception e){
            logger.error("error {}",e.getMessage(),e);
        }
        return names;

    }

}
