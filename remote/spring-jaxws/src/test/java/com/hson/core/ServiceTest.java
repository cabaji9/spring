package com.hson.core;

import com.hson.core.bean.ServiceWsEndpoint;
import com.hson.core.pojo.WsVo;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:remoting-servlet.xml"})
public class ServiceTest {

    //autowiring with different implementations

    @Autowired
    private ServiceWsEndpoint serviceWsEndpoint;


    @Test
    public void testWs(){

        WsVo wsVo = new WsVo();
        wsVo.setName("hola");
        wsVo.setData("data");

        serviceWsEndpoint.save(wsVo);
        serviceWsEndpoint.getAll();
        serviceWsEndpoint.delete(wsVo);


    }



}

