package com.haishili.java.context;
import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class AServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=utf-8");
        PrintWriter out = servletResponse.getWriter();
        //获取 ServletContext对象
        ServletContext application = this.getServletContext();
        out.println(application+"<br>");

        //获取上下文初始化参数
        Enumeration<String> initParameterNames = application.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String initParameterName = initParameterNames.nextElement();
            String initParameterValue = application.getInitParameter(initParameterName);
            out.println(initParameterName + "=" + initParameterValue);
        }

        //获取 context path（获取应用上下文的根）
        String contextPath = application.getContextPath();
        String realPath = application.getRealPath("/index.html");
        out.println(contextPath+" "+realPath);
    }
}
