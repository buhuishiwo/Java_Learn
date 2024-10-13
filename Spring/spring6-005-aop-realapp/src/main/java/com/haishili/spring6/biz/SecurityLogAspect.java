package com.haishili.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
public class SecurityLogAspect {
    @Pointcut("execution(* com.haishili.spring6.biz..*(..))")
    public void pointcut() {}
    @Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint) throws Throwable {
        String nowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(nowDate);
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println("进行了"+className+"的"+methodName+"操作");
    }
}
