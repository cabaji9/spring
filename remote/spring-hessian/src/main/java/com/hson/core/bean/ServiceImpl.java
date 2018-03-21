package com.hson.core.bean;

import com.hson.core.pojo.Vo;
import com.hson.core.service.ServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Hyun Woo Son on 3/19/18
 **/
public class ServiceImpl implements ServiceInterface {

    private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);

    public void save(Vo vo) {
        logger.info("ingresa a save: {}", vo);
    }

    public List<Vo> getAll() {
        logger.info("retorna todos");
        return null;
    }

    public void delete(Vo vo) {
        logger.info("elimina rmivo: {}", vo);

    }
}
