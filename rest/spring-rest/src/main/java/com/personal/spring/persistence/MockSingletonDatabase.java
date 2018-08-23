package com.personal.spring.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Hyun Woo Son on 1/24/18
 **/
public class MockSingletonDatabase {

    private static MockSingletonDatabase mockSingletonDatabase;

    private MockSingletonDatabase() {
        data = new HashMap<>();
    }

    private HashMap<String, Object> data;

    public static MockSingletonDatabase getInstance() {
        if (mockSingletonDatabase == null) {
            mockSingletonDatabase = new MockSingletonDatabase();
        }
        return mockSingletonDatabase;
    }

    public void put(String label, Object object) {
        data.put(label, object);
    }

    public <T> T get(String label) {
        return (T)data.get(label);
    }

    public <T> List<T> getAll() {
        List<T> objects = new ArrayList<>();
        if(data != null){
            for (String key : data.keySet()) {
                objects.add((T)data.get(key));
            }
        }
        return objects;
    }


}
