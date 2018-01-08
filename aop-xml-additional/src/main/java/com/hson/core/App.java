package com.hson.core;


import com.hson.core.bean.Student;
import com.hson.core.bean.StudentAdditionalDetails;
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
        StudentAdditionalDetails studentAdditionalDetails = (StudentAdditionalDetails) ctx.getBean("studentAdditionalDetailsGood");

        studentAdditionalDetails.showAdditionalDetails();
        ((Student)studentAdditionalDetails).showDetails();

    }
}
