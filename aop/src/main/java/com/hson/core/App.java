package com.hson.core;

import com.hson.core.bean.HelloWorldB;
import com.hson.core.bean.Performance;
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

        Performance performance=   ctx.getBean(Performance.class);

        performance.perform();
        performance.sing(1);
        performance.sing(2);


        HelloWorldB helloWorldB =   ctx.getBean(HelloWorldB.class);
        helloWorldB.sayHello();
        helloWorldB.sayHelloParam("DRAGONISA");

        helloWorldB.returnHello("VUELVE");

        helloWorldB.launchException();





    }
}
