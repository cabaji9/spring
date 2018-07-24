package com.hson.core.dao;

import com.hson.core.model.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Hyun Woo Son on 1/8/18
 **/
@Component
public interface UserDao {

    void insert(UserEntity userEntity);

    List<UserEntity> obtainUserEntityAll();
}
