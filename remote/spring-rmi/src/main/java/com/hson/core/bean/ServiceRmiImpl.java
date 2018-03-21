package com.hson.core.bean;

import com.hson.core.pojo.RmiVo;
import com.hson.core.service.ServiceRmi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Hyun Woo Son on 3/19/18
 **/
public class ServiceRmiImpl implements ServiceRmi{

    private static final Logger logger = LoggerFactory.getLogger(ServiceRmiImpl.class);

    public void save(RmiVo rmiVo) {
        logger.info("ingresa a save: {}",rmiVo);
    }

    public List<RmiVo> getAll() {
        logger.info("retorna todos");
        return null;
    }

    public void delete(RmiVo rmiVo) {
        logger.info("elimina rmivo: {}",rmiVo);

    }
}
