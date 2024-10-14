package com.haishili.spring6.homework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan({"com.haishili.spring6.homework"})
@EnableAspectJAutoProxy
public class Spring6Config3 {
}
