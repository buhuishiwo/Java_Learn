package com.haishili.javaweb.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<String> strings = parameterMap.keySet();
        for (String string : strings) {
            System.out.print(string + "=");
            String[] values = parameterMap.get(string);
            for(String value : values) {
                System.out.print(value + " ");
            }
            System.out.println(" ");
        }
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            System.out.print(parameterName + "=");
            String[] values = req.getParameterValues(parameterName);
            for(String value : values) {
                System.out.print(value + " ");

            }
            System.out.println(" ");
        }
    }
}
