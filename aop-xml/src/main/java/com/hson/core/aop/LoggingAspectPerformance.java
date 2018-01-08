package com.hson.core.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Hyun Woo Son on 12/11/17
 **/
public class LoggingAspectPerformance {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspectPerformance.class);


    public void takeSeats() {
        logger.info("take seats");
    }

    public void turnOffCellPhones() {
        logger.info("turn off");
    }

    public void applaud() {
        logger.info("clap clap clap");
    }

    public void demandRefund() {
        logger.info("Boo! i want my money back");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("TAKING SEATS");
        logger.info("TURN ON CELL PHONES!");

        long start = System.currentTimeMillis();

        joinPoint.proceed();


        long end = System.currentTimeMillis();

        logger.info("CLAP CALP CLAP");
        logger.info("THE PERFOMANCE TOOK {} MILISECONDS",end-start);



    }


}
