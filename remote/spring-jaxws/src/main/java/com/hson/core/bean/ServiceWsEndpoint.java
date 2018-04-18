package com.hson.core.bean;

import com.hson.core.pojo.WsVo;
import com.hson.core.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Hyun Woo Son on 3/19/18
 **/
@Component
@WebService(serviceName="serviceWs")
public class ServiceWsEndpoint {


    @Autowired
    @Qualifier("serviceImpl")
    private Service rmiServiceProxy;

    @WebMethod
    public void save(WsVo wsVo) {
        rmiServiceProxy.save(wsVo);
    }

    @WebMethod
    public List<WsVo> getAll() {
        return rmiServiceProxy.getAll();
    }


    @WebMethod
    public void delete(WsVo wsVo) {
        rmiServiceProxy.delete(wsVo);

    }


}
