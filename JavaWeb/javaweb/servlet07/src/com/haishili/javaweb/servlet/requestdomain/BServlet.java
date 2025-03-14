package com.haishili.javaweb.servlet.requestdomain;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Object time = req.getAttribute("nowTime");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println(time);

        String username = req.getParameter("username");
        out.println(username);

        String contextPath = req.getContextPath();
        out.println(contextPath);
        System.out.println(contextPath);
    }
}
