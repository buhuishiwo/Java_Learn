package com.haishili.oa.web.action;

import com.haishili.oa.utils.DBUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/welcome")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        Cookie[] cookies = req.getCookies();
        String loginName = null;
        String loginPassword = null;
        if(cookies != null) {
            for (Cookie cookie : cookies) {
                if ("loginName".equals(cookie.getName())) {
                    loginName = cookie.getValue();
                }
                if ("loginPassword".equals(cookie.getName())) {
                    loginPassword = cookie.getValue();
                }
            }
        }
        if(loginName != null && loginPassword != null) {
            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            try {
                conn = DBUtils.getConnection();
                String sql = "select * from t_user where username=? and password=?";
                ps = conn.prepareStatement(sql);
                ps.setString(1,loginName);
                ps.setString(2,loginPassword);
                rs = ps.executeQuery();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            if(rs != null) {
                HttpSession session = req.getSession();
                session.setAttribute("loginName", loginName);
                resp.sendRedirect(req.getContextPath() + "/dept/list");
            }else{
                resp.sendRedirect(req.getContextPath() + "/index.jsp");
            }
        }
        else{
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
        }
    }
}
