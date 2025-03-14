package com.haishili.javaweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "hello" , urlPatterns = {"/hello","/hello2 "},
        initParams = {@WebInitParam(name="Name",value = "li"),@WebInitParam(name = "passwd",value = "root")})
public class HelloServlet extends HttpServlet {
    public HelloServlet() {
        System.out.println("无参构造被调用，实例被创建");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        String servletName = getServletName();
        out.println("Servlet Name="+servletName);
        Enumeration<String> initParameterNames = getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String initParameterName = initParameterNames.nextElement();
            String initParameterValue = getInitParameter(initParameterName);
            out.println("initParameterName="+initParameterName);
            out.println("initParameterValue="+initParameterValue);
        }

    }
}
