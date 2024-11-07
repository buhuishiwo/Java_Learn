package com.haishili.spring6.exercise;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {
    @Pointcut("execution(* com.haishili.spring6.exercise..*(..))")
    public void pointCut() {}

    @Around("pointCut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知开始");
        joinPoint.proceed();
        System.out.println("环绕通知结束");
    }
    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName()+"执行");
    }
    @AfterReturning("pointCut()")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName()+"执行完成");
    }
    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("执行结束");
    }
}
