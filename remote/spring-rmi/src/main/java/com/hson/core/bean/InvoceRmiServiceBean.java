package com.hson.core.bean;

import com.hson.core.pojo.RmiVo;
import com.hson.core.service.ServiceRmi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by Hyun Woo Son on 3/19/18
 **/
public class InvoceRmiServiceBean {


    @Autowired
    @Qualifier("rmiServiceProxy")
    private ServiceRmi rmiServiceProxy;


    public void save(RmiVo rmiVo) {
        rmiServiceProxy.save(rmiVo);
    }

    public List<RmiVo> getAll() {
        return rmiServiceProxy.getAll();
    }

    public void delete(RmiVo rmiVo) {
        rmiServiceProxy.delete(rmiVo);

    }


}
