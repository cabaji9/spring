package com.hson.core;


import com.hson.core.bean.ServiceWsEndpoint;
import com.hson.core.pojo.WsVo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("remoting-servlet.xml");

        ServiceWsEndpoint serviceWsEndpoint =    ctx.getBean(ServiceWsEndpoint.class);

        WsVo wsVo = new WsVo();
        wsVo.setName("hola");
        wsVo.setData("data");

        serviceWsEndpoint.save(wsVo);
        serviceWsEndpoint.getAll();
        serviceWsEndpoint.delete(wsVo);

    }
}
