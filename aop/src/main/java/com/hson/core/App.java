package com.hson.core;

import com.hson.core.bean.HelloWorldB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  throws Exception
    {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
        HelloWorldB helloWorldB =   ctx.getBean(HelloWorldB.class);
        helloWorldB.sayHello();
        helloWorldB.sayHelloParam("DRAGONISA");

        helloWorldB.returnHello("VUELVE");

        helloWorldB.launchException();
    }
}
