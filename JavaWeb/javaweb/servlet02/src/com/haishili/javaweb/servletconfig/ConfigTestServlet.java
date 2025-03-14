package com.haishili.javaweb.servletconfig;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ConfigTestServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=utf-8");
        PrintWriter out = servletResponse.getWriter();
        ServletConfig servletConfig = this.getServletConfig();

        //方法一
        ServletContext servletContext = servletConfig.getServletContext();
        //方法二
        ServletContext servletContext1 = this.getServletContext();

//        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
//        while(initParameterNames.hasMoreElements()) {
//            String initParameterName = initParameterNames.nextElement();
//            out.println("<h1>" + initParameterName + "</h1>");
//            String initParameterValue = servletConfig.getInitParameter(initParameterName);
//            out.println("<p>" + initParameterValue + "</p>");
//        }
//        Enumeration<String> initNames= this.getInitParameterNames();
//        while(initNames.hasMoreElements()) {
//            String initName = initNames.nextElement();
//            out.println("<h1>" + initName + "</h1>");
//            String initParameter = this.getInitParameter(initName);
//            out.println("<p>" + initParameter + "</p>");
//        }
    }
}
