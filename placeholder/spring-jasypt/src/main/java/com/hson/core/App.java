package com.hson.core;


import com.hson.core.bean.BlankDisc;
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
        System.setProperty("secret","superSecretKey");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");

        BlankDisc blankDisc =ctx.getBean(BlankDisc.class);
        blankDisc.play();

    }
}
