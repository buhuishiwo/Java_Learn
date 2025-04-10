package com.haishili.javaweb.servlet.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author Haishili
 */
@WebServlet("/cookie/generate")
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建cookie对象
        Cookie cookie = new Cookie("cookie", "1234");
        Cookie zhangsan = new Cookie("zhangsan", "123422");
        //设置cookie的存在时间
        //value>0则保存在硬盘中
        //value=0则表示删除同名cookie
        //value<0则cookie不会被存储到硬盘文件中，会放在浏览器运行内存中
        cookie.setMaxAge(3600);
        //Change the cookie's Path to project's context path
        cookie.setPath(req.getContextPath());
        zhangsan.setPath(req.getContextPath());
        //把cookie传到浏览器
        resp.addCookie(cookie);
        resp.addCookie(zhangsan);
        
    }
}
