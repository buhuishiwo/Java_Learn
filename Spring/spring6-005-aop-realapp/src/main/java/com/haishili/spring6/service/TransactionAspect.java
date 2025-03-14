package com.haishili.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("transactionAspect")
@Aspect
public class TransactionAspect {
    //编程式事务解决
    @Pointcut("execution(* com.haishili.spring6.service..*(..))")
    public void pointcut() {}
    @Around("pointcut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("开启事务");
            joinPoint.proceed();
            System.out.println("提交事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");
            e.printStackTrace();
        }
    }
}
