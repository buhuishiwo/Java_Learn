package com.haishili.servlet_;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet implements Servlet {
    public void init(ServletConfig config) throws ServletException{

    }
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.print("My First Servlet,Hello Servlet");
        //设置响应的内容类型为文本或 html 代码
        servletResponse.setContentType("text/html");
        //怎么将一个信息直接输出到浏览器上？
        //需要使用 ServletResponse 接口：response
        //response 表示响应：从服务器向浏览器发送数据叫做响应。
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Hello Servlet");
        writer.println("<h1>Hello Servlet<h1>");
        //这是一个输出流，负责输出字符串到浏览器
        //这个输出流不需要我们刷新和关闭，Tomcat 会来维护
        /*
        * writer.flush();
        * writer.close();
        * */
    }
}