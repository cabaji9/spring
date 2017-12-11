package com.hson.core.aop;

import com.hson.core.bean.HelloWorldB;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Hyun Woo Son on 11/14/17.
 */

@Aspect
public class LogginAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogginAspect.class);


    @Before("execution(* com.hson.core.bean.HelloWorldB.sayHello(..))")
    public void logBefore(JoinPoint joinPoint) {

        logger.info("logBefore() is running!");
        logger.info("hijacked : " + joinPoint.getSignature().getName());
        logger.info("******");
    }


    @Before("execution(* com.hson.core.bean.HelloWorldB.sayHelloParam(..))")
    public void logBeforeParam(JoinPoint joinPoint) {
        logger.info("logBefore() is running!");
        logger.info("hijacked : " + joinPoint.getSignature().getName());
        logger.info("******");
        logger.info("Params: {},",joinPoint.getArgs());
    }


    @After("execution(* com.hson.core.bean.HelloWorldB.sayHelloParam(..))")
    public void logAfterParam(JoinPoint joinPoint) {
        logger.info("logAfter() is running!");
        logger.info("hijacked : " + joinPoint.getSignature().getName());
        logger.info("******");
    }



    @Around("execution(* com.hson.core.bean.HelloWorldB.sayHelloParam(..))")
    public void logAroundParam(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("logaround() is running!");
        logger.info("hijacked : " + joinPoint.getSignature().getName());
        logger.info("****** before proceed");
        joinPoint.proceed(); //continue on the intercepted method
        logger.info("****** after proceed");
    }


    @AfterReturning(
            pointcut = "execution(* com.hson.core.bean.HelloWorldB.returnHello(..))",
            returning= "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {

        System.out.println("logAfterReturning() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);
        System.out.println("******");

    }


    @AfterThrowing(pointcut = "execution(* com.hson.core.bean.HelloWorldB.launchException(..))",
                    throwing = "e")
    public void logException(JoinPoint joinPoint, Throwable e){

        logger.error("HA OCURRIDO UN ERROR {}",e.getMessage(),e);

    }

}
