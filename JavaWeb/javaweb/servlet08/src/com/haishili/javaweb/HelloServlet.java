package com.haishili.javaweb;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;


@WebServlet(name = "hello" , urlPatterns = {"/hello","/hello2 "})
public class HelloServlet extends HttpServlet {
}
