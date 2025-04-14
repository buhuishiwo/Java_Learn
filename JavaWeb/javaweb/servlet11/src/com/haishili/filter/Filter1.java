package com.haishili.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
//注解方法
//模糊匹配，前面不加“/”
@WebFilter("*.do")
public class Filter1 implements Filter {

    public Filter1() {
        System.out.println("无参构造方法执行");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //请求前添加过滤器
        System.out.println("doFilter方法执行");
        //表示执行下一个过滤器，如果没有下一个过滤器，则执行目标程序的Servlet
        filterChain.doFilter(servletRequest, servletResponse);
        //请求后添加过滤器
        System.out.println("doFilter方法执行结束");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init方法执行");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
