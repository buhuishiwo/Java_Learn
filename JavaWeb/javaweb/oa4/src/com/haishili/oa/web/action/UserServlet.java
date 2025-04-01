package com.haishili.oa.web.action;

import com.haishili.oa.utils.DBUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet({"/user/login","/user/exit"})
public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        //判断访问路径来选择具体调用的方法
        if(servletPath.equals("/user/login")) {
            doLogin(req,resp);
        } else  {
            doExit(req,resp);
        }
    }

    private void doExit(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession(false);
        Cookie[] cookies = req.getCookies();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (session != null && cookies != null) {
            session.invalidate();
            for (Cookie cookie : cookies) {
                cookie.setValue("");
                //删除cookie
                cookie.setMaxAge(0);
                cookie.setPath(req.getContextPath());
                resp.addCookie(cookie);
            }
        }
        out.println("退出成功");
        resp.sendRedirect(req.getContextPath()+"/index.jsp");
    }

    private void doLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        //获取用户发送数据
        //与服务器中数据对比
        //返回前端登录结果
        boolean success = false;
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username);
        System.out.println(password);

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select * from t_user where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                success = true;
                session.setAttribute("loginName", username);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (success) {
            //成功
            if(req.getParameter("isChecked")!=null) {
                if(req.getParameter("isChecked").equals("1")) {
                    Cookie cookie1 = new Cookie("loginName", username);
                    Cookie cookie2 = new Cookie("loginPassword", password);
                    Cookie cookie3 = new Cookie("sessionId", req.getSession().getId());
                    cookie1.setPath(req.getContextPath());
                    cookie2.setPath(req.getContextPath());
                    cookie3.setPath(req.getContextPath());
                    cookie1.setMaxAge(60 * 60 * 24 * 10);
                    cookie2.setMaxAge(60 * 60 * 24 * 10);
                    cookie3.setMaxAge(60 * 60 * 24 * 10);
                    resp.addCookie(cookie1);
                    resp.addCookie(cookie2);
                    resp.addCookie(cookie3);
                }
            }
            resp.sendRedirect(req.getContextPath() + "/dept/list");
        } else {
            //失败
            resp.sendRedirect(req.getContextPath() + "/error.jsp");
        }
    }

}
