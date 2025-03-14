package com.haishili.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan({"com.haishili.spring6.service"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Config {
}
