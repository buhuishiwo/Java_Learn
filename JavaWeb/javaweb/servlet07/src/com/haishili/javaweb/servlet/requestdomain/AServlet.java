package com.haishili.javaweb.servlet.requestdomain;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date nowTime = new Date();

        req.setAttribute("nowTime", nowTime);   
        Object time = req.getAttribute("nowTime");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println(time);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/b");
        requestDispatcher.forward(req, resp);
//        req.getRequestDispatcher("/register.html").forward(req, resp);
    }
}
