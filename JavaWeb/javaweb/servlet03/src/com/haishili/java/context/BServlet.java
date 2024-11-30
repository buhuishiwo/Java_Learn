package com.haishili.java.context;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class BServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=utf-8");
        PrintWriter out = servletResponse.getWriter();
        //获取 ServletContext对象
        ServletContext application = this.getServletContext();
        out.println(application);
    }
}
