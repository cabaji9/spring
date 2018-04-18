package com.hson.core.service;

import com.hson.core.pojo.WsVo;

import java.util.List;

/**
 * Created by Hyun Woo Son on 3/19/18
 **/
public interface Service {


    void save(WsVo wsVo);

    List<WsVo> getAll();

    void delete(WsVo wsVo);

}
