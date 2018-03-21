package com.hson.core;


import com.hson.core.bean.InvoqueHessianServiceBean;
import com.hson.core.pojo.Vo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("//Users/User/java/codigo/personal/spring/remote/spring-hessian/src/main/webapp/WEB-INF/remoting-servlet.xml");

        InvoqueHessianServiceBean invoqueHessianServiceBean =    ctx.getBean(InvoqueHessianServiceBean.class);

        Vo vo = new Vo();
        vo.setName("hola");
        vo.setData("data");

        invoqueHessianServiceBean.save(vo);
        invoqueHessianServiceBean.getAll();
        invoqueHessianServiceBean.delete(vo);

    }
}
