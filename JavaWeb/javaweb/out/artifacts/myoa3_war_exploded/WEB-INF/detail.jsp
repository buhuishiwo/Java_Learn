<%@ page import="com.haishili.oa.bean.Dept" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>部门详情</title>
</head>
<body>
    <%
        Dept dept =  (Dept) request.getAttribute("depts");
    %>
    <h1>部门详情</h1>
    <hr>
    部门编号：<%=dept.getDeptNo()%> <br>
    部门名称：<%=dept.getDeptName()%> <br>
    部门位置：<%=dept.getDeptLoc()%>
</body>
</html>