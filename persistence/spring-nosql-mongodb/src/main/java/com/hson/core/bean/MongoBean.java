package com.hson.core.bean;

import com.hson.core.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 7/24/18.
 */
@Component
public class MongoBean {


    @Autowired
    MongoOperations mongoOperations;


    public void save(Usuario usuario){
        mongoOperations.save(usuario);
    }

}
