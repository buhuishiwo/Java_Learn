package com.haishili.oa.web.action;

import com.haishili.oa.utils.DBUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/user/login")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
