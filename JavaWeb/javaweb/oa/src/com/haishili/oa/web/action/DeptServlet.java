package com.haishili.oa.web.action;

import com.haishili.oa.utils.DBUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet({"/dept/list","/dept/save"})
public class DeptServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        if("/dept/add".equals(servletPath)) {
            doList(req,resp);
        } else if("/dept/save".equals(servletPath)) {
            doSave(req,resp);
        }
    }

    private void doSave(HttpServletRequest req, HttpServletResponse resp) {
        
    }

    private void doList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html lang='en'>");
        out.print("<head>");
        out.print("    <meta charset='UTF-8'>");
        out.print("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.print("    <title>部门列表页面</title>");
        out.print("    <style>");
        out.print("                a {");
        out.print("            text-decoration: none;");
        out.print("            color: black;");
        out.print("        }");
        out.print("        a:hover {");
        out.print("            color: rgb(10, 31, 168);");
        out.print("        }");
        out.print("    </style>");

        out.println("<script>");
        out.println("    function del(dno) {");
        out.println("let ok = window.confirm('确认删除?')");
        out.println("if(ok) {");
        out.println("   document.location.href='/oa/dept/delete?deptno='+dno");
        out.println("    }");
        out.println("}");
        out.print("</script>");

        out.print("</head>");
        out.print("<body>");
        out.print("    <h1 style='text-align: center;'>部门列表</h1>");
        out.print("    <hr>");
        out.print("    <table border='1px' align='center' width='50%'>");
        out.print("        <tr>");
        out.print("            <th>序号</th>");
        out.print("            <th>部门编号</th>");
        out.print("            <th>部门名称</th>");
        out.print("            <th>操作</th>");
        out.print("        </tr>");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // 获取连接
            conn = DBUtils.getConnection();
            // 获取预编译的数据库操作对象
            String sql = "select deptno,dname,loc from dept";
            pstmt = conn.prepareStatement(sql);
            // 执行 sql 语句
            rs = pstmt.executeQuery();
            // 处理结果集
            int i = 0;
            while (rs.next()) {
                String deptno = rs.getString("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                out.print("        <tr>");
                out.print("            <td>"+(++i)+"</td>");
                out.print("            <td>"+deptno+"</td>");
                out.print("            <td>"+dname+"</td>");
                out.print("            <td>");
                out.print("                <a href='javascript:void(0)' onclick='del("+deptno+")'>");
                out.print("                删除");
                out.print("                </a>");
                out.print("                <a href='/oa/dept/edit?deptno="+deptno+"'>");
                out.print("                修改");
                out.print("                </a>");
                out.print("                <a href='/oa/dept/detail?deptno="+deptno+"'>");
                out.print("                详情");
                out.print("                </a>");
                out.print("            </td>");
                out.print("        </tr>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭链接
                DBUtils.close(conn,pstmt,rs);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        out.print("    </table>");
        out.print("    <a href='/oa/add.html'>新增部门</a>");
        out.print("</body>");
        out.print("</html>");
    }
    
}
