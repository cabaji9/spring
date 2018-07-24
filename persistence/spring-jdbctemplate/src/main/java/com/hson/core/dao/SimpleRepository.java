package com.hson.core.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Hyun Woo Son on 7/13/18.
 */
@Repository
public class SimpleRepository {

    private JdbcOperations jdbcOperations;

    @Autowired
    public SimpleRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }



    public void insert(Integer id, String name){

        jdbcOperations.update("INSERT INTO USERA(ID,NAMEM) VALUES(?,?)",
                id,name
                );
    }

    public List<String> getNames() {

        List<String> names = new ArrayList<String>();
        List<Map<String, Object>> rows = jdbcOperations.queryForList("select * from usera");
        for (Map<String, Object> row : rows) {
            names.add((String)row.get("namem"));
        }
        return names;
    }


}
