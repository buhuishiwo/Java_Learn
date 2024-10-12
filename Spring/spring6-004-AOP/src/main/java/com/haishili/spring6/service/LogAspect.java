package com.haishili.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logAspect")
@Aspect //切面类是需要 Aspect 注解标注的
public class LogAspect {

    @Pointcut("execution(* com.haishili.spring6.service..*(..))")
    public void logPointcut() {}
    @Before("logPointcut()")
    public void beforeAdvice() {
        System.out.println("This is a beforeAdvice!");
    }
    @AfterReturning("logPointcut()")
    public void afterreturningAdvice() {
        System.out.println("This is a afterAdvice!");
    }
    @Around("logPointcut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("This is a Before aroundAdvice!");
        joinPoint.proceed();
        System.out.println("This is a After aroundAdvice!");
    }
    @After("logPointcut()")
    public void afterAdvice() {
        System.out.println("最终通知");
    }
//    @AfterThrowing("logPointcut()")
//    public void afterThrowingAdvice() {
//        System.out.println("异常通知");
//    }
}
