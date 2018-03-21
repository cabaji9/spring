package com.hson.core;

import com.hson.core.bean.InvoqueHessianServiceBean;
import com.hson.core.pojo.Vo;
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
public class ServiceInterfaceTest {

    //autowiring with different implementations

    @Autowired
    private InvoqueHessianServiceBean invoqueHessianServiceBean;


    @Test
    public void testRmi(){

        Vo vo = new Vo();
        vo.setName("hola");
        vo.setData("data");

        invoqueHessianServiceBean.save(vo);
        invoqueHessianServiceBean.getAll();
        invoqueHessianServiceBean.delete(vo);


    }



}

