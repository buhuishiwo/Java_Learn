package com.haishili.javaweb.servlet;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class AServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("AServlet's init方法被调用");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("AServlet's service method execute!");
//        servletResponse.setContentType("text/html;charset=utf-8");
//        PrintWriter out = servletResponse.getWriter();
//        out.println("hello world");
    }

    @Override
    public void destroy() {
        System.out.println("AServlet's destroy method execute!");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
}
