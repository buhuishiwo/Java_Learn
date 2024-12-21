package com.haishili.oa.web.action;

import com.haishili.oa.utils.DBUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String deptno = req.getParameter("deptno");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int i = 0;
        try {
            conn = DBUtils.getConnection();
            String sql = "delete from dept where deptno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, deptno);
            //返回影响了数据库表多少条记录
            i = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                DBUtils.close(conn,pstmt,rs);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(i == 1) {
            req.getRequestDispatcher("/dept/list").forward(req, resp);
        }
    }
}
