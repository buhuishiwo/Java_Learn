package com.haishili.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("logAspect")
@Aspect //切面类是需要 Aspect 注解标注的
public class LogAspect {

    @Before("execution(* com.haishili.spring6.service.UserService.login())")
    public void beforeAdvice() {
        System.out.println("This is a beforeAdvice!");
    }
}
