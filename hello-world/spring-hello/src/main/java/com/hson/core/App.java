package com.hson.core;

import com.hson.core.bean.HelloWorld;
import com.hson.core.bean.HelloWorldB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //THIS WILL OBTAIN CONFIG FROM XML
        ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
        HelloWorld helloWorld =(HelloWorld)  context.getBean("helloBean");
        helloWorld.sayHello();

        //THIS WILL OBTAIN CONFIG FROM ANOTATTIONS AND SPECIFYING THE CONFIG CLASS, ONLY WORKS IF EVERYTHING
        //IS ANNOTATION BASED.
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(HelloConfig.class);
        ctx.refresh();

        HelloWorldB helloWorldB =   ctx.getBean(HelloWorldB.class);
        helloWorldB.sayHello();


        //THIS WILL OBTAIN ONLY BASED ON THE CONTEXT COMPONENT SCAN DESPITE BEING CALLED FROM THE CLASSPATHXMLT CONTEXT.
        //USE IT WHEN MIX ANNOTATIONS AND XML CONFIG
        HelloWorldB helloWorldBContext =   context.getBean(HelloWorldB.class);
        helloWorldBContext.sayHello();




    }
}
