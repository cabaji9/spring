package com.hson.core.bean;

import com.hson.core.pojo.Vo;
import com.hson.core.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Hyun Woo Son on 3/19/18
 **/
public class InvoqueHessianServiceBean {


    @Autowired
    @Qualifier("hessianServiceProxy")
    private ServiceInterface rmiServiceProxy;


    public void save(Vo vo) {
        rmiServiceProxy.save(vo);
    }

    public List<Vo> getAll() {
        return rmiServiceProxy.getAll();
    }

    public void delete(Vo vo) {
        rmiServiceProxy.delete(vo);

    }


}
