package com.haishili.spring6.biz;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan({"com.haishili.spring6.biz"})
@EnableAspectJAutoProxy
public class Spring6Config2 {

}
