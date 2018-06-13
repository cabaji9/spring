package com.hson.core.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Hyun Woo Son on 12/11/17
 **/
@Aspect
public class LoggingAspectPerformance {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspectPerformance.class);


    @Pointcut("execution(* com.hson.core.bean.PerformanceBean.perform(..))")
    public void performance(){
        logger.info("POINTCUT PERFORMANCE");
    }

    @Before("performance()")
    public void before(){
        logger.info("BEFORE!!");
    }

    @After("performance()")
    public void after(){
        logger.info("AFTER!");
    }

    @Pointcut("execution(* com.hson.core.bean.PerformanceBean.sing(int)) && args(songNumber)")
    public void sing(int songNumber){

    }


    @Before("sing(songNumber)")
    public void beforeSing(int songNumber){
        logger.info("BEFORE SING SONG NUMBER: {}",songNumber);
    }


    @Before("execution(* com.hson.core.bean.PerformanceBean.sing(..))")
    public void beforeSingPointCut(JoinPoint joinPoint){
        logger.info("logBefore() is running!");
        logger.info("hijacked : " + joinPoint.getSignature().getName());
        logger.info("******");
        logger.info("Params: {},",joinPoint.getArgs());

    }





}
