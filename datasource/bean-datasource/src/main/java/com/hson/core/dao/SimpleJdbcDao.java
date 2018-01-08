package com.hson.core.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Hyun Woo Son on 1/5/18
 **/
public class SimpleJdbcDao extends JdbcDaoSupport {


    public void insert(Integer id, String name) {
        getJdbcTemplate().update("INSERT INTO USERA(ID,NAMEM) VALUES(?,?)", new Object[]{id, name});
    }


    public List<String> getNames() {

        List<String> names = new ArrayList<String>();
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList("select * from usera");
        for (Map<String, Object> row : rows) {
            names.add((String)row.get("namem"));
        }
        return names;
    }


}
