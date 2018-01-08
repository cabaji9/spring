package com.hson.core;

import com.hson.core.bean.Performance;
import com.hson.core.bean.Thinker;
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

        performance.perform(1);
        //performance.perform(5);

        performance.sing(1);
        performance.sing(2);


        Thinker thinker =ctx.getBean(Thinker.class);
        thinker.thinkOfSomething("MIRALA !!");

    }
}
