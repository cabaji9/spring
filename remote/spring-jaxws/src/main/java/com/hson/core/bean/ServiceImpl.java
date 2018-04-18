package com.hson.core.bean;

import com.hson.core.pojo.WsVo;
import com.hson.core.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Hyun Woo Son on 3/19/18
 **/
public class ServiceImpl implements Service {

    private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);

    public void save(WsVo wsVo) {
        logger.info("ingresa a save: {}", wsVo);
    }

    public List<WsVo> getAll() {
        logger.info("retorna todos");
        return null;
    }

    public void delete(WsVo wsVo) {
        logger.info("elimina rmivo: {}", wsVo);

    }
}
