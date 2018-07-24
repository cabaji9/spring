package com.hson.core.repository;

import com.hson.core.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by Hyun Woo Son on 7/18/18.
 */
public interface UseraRepository extends JpaRepository<UserEntity,Long> {


    UserEntity findByName(String name);

    Integer countById(Long id);

    @Query("select count(u) from UserEntity  u")
    Integer countAll();



}
