package com.haishili.spring.annoation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//自定义注解

//标注注解的注解，元注解。用来修饰@Component 可以出现的位置
//这里的参数表示@Component 可以出现在类上，属性上
@Target(value = {ElementType.TYPE,ElementType.FIELD})
public @interface Component {
}
