package com.hson.core.service;

import com.hson.core.pojo.Vo;

import java.util.List;

/**
 * Created by Hyun Woo Son on 3/19/18
 **/
public interface ServiceInterface {


    void save(Vo vo);

    List<Vo> getAll();

    void delete(Vo vo);

}
