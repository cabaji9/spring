package com.hson.core;

import com.hson.core.bean.HelloWorldB;
import com.hson.core.bean.Performance;
import com.hson.core.bean.PerformanceBean;
import com.hson.core.introduction.EncoreableInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Performance performance=  (Performance) ctx.getBean("performanceBean");

        performance.perform();
        performance.sing(1);
        performance.sing(2);

        //added introduced method
        EncoreableInterface encoreableInterface =(EncoreableInterface) ctx.getBean("performanceBean");

        encoreableInterface.performEncore();



//        HelloWorldB helloWorldB =   ctx.getBean(HelloWorldB.class);
//        helloWorldB.sayHello();
//        helloWorldB.sayHelloParam("DRAGONISA");
//
//        helloWorldB.returnHello("VUELVE");
//
//        helloWorldB.launchException();





    }
}
