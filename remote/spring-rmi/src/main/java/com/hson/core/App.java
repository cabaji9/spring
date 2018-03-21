package com.hson.core;


import com.hson.core.bean.InvoceRmiServiceBean;
import com.hson.core.pojo.RmiVo;
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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");

        InvoceRmiServiceBean invoceRmiServiceBean =    ctx.getBean(InvoceRmiServiceBean.class);

        RmiVo rmiVo = new RmiVo();
        rmiVo.setName("hola");
        rmiVo.setData("data");

        invoceRmiServiceBean.save(rmiVo);
        invoceRmiServiceBean.getAll();
        invoceRmiServiceBean.delete(rmiVo);

    }
}
