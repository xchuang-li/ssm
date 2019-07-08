package com.cay.ssm.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {
    Logger logger= LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Around("execution(* com.cay.ssm.service.FoodService.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        before();
        Object result = pjp.proceed();
        after();
        return result;
    }
    private void before(){
        logger.info("before!");
    }
    private void after(){
        logger.info("after!");
    }
}
