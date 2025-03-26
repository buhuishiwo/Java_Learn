package com.haishili.oa.web.action;

import com.haishili.oa.utils.DBUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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

        if(servletPath.equals("/user/login")) {
            doLogin(req,resp);
        } else if (servletPath.equals("/user/exit")) {
            doExit(req,resp);
        }
    }

    private void doExit(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession(false);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (session != null) {
            session.invalidate();
            out.println("退出成功");
            resp.sendRedirect(req.getContextPath());
        }
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
                session.setAttribute("username", username);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (success) {
            //成功

            resp.sendRedirect(req.getContextPath() + "/dept/list");
        } else {
            //失败
            resp.sendRedirect(req.getContextPath() + "/error.jsp");
        }
    }

}
