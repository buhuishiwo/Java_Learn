package com.haishili.spring6.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.haishili.spring6.service.UserService.*(..))")
    public void pointCut() {}
    @Pointcut("execution(* com.haishili.spring6.service.UserService.userBorrow(String))&& args(bookName)")
    public void pointCutUser(String bookName) {}

    @Before("pointCutUser(bookName)")
    public void before(String bookName) {
        System.out.println("用户借书：" + bookName+"时间"+ LocalTime.now());
    }
    @AfterReturning("pointCutUser(bookName)")
    public void after(String bookName) {
        System.out.println("用户借书借书" + bookName+"时间"+ LocalTime.now());
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("用户操作开始");
        joinPoint.proceed();
        System.out.println("用户操作结束");
    }
    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName()+"操作结束");
    }
}
