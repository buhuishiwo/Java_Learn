package com.haishili.spring6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.haishili.spring6.service")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Configuration {
}
