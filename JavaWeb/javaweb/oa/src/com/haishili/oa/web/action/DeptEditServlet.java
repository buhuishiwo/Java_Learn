package com.haishili.oa.web.action;

import com.haishili.oa.utils.DBUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String deptno = req.getParameter("deptno");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html lang='en'>");
        out.print("<head>");
        out.print("    <meta charset='UTF-8'>");
        out.print("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.print("    <title>修改页面</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("    <h1>修改部门</h1>");
        out.print("    <hr>");
        out.print("    <form action='/oa/dept/modify' method='post'>");
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "select * from dept where deptno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, deptno);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String deptno1 = rs.getString("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                out.print("部门编号<input type='text' name='deptno' value='"+deptno1+"' readonly><br>");
                out.print("部门名称<input type='text' name='dname' value='"+dname+"'><br>");
                out.print("部门位置<input type='text' name='loc' value='"+loc+"'><br>");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                DBUtils.close(conn,pstmt,rs);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        out.print("<input type='submit' value='保存'>");
        out.print("    </form>");
        out.print("</body>");
        out.print("</html>");
    }
}
