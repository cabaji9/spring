package com.hson.core.repository;

import com.hson.core.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Hyun Woo Son on 7/23/18.
 */
public interface UsuarioRepository extends MongoRepository<Usuario,String> {

    Usuario findUsuarioByName(String name);

}
