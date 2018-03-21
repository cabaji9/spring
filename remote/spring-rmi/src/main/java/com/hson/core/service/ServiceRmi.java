package com.hson.core.service;

import com.hson.core.pojo.RmiVo;

import java.util.List;

/**
 * Created by Hyun Woo Son on 3/19/18
 **/
public interface ServiceRmi {


    void save(RmiVo rmiVo);

    List<RmiVo> getAll();

    void delete(RmiVo rmiVo);

}
