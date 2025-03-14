package org.myspringframework.core;

//MySpring 框架应用上下文接口
public interface ApplicationContext {
    //根据 Bean 的名称获取对应的 bean 对象
    Object getBean(String name);
}
