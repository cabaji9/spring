package org.hson.repository;

import org.hson.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Hyun Woo Son on 9/4/18.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {


    List<User> findUserByName(String name);

}
