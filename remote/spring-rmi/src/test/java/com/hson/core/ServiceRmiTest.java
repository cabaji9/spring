package com.hson.core;

import com.hson.core.bean.InvoceRmiServiceBean;
import com.hson.core.pojo.RmiVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springbeans.xml"})
public class ServiceRmiTest {

    //autowiring with different implementations

    @Autowired
    private InvoceRmiServiceBean invoceRmiServiceBean;


    @Test
    public void testRmi(){

        RmiVo rmiVo = new RmiVo();
        rmiVo.setName("hola");
        rmiVo.setData("data");

        invoceRmiServiceBean.save(rmiVo);
        invoceRmiServiceBean.getAll();
        invoceRmiServiceBean.delete(rmiVo);


    }



}

