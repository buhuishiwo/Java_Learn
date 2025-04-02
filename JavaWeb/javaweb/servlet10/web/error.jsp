<%--
  Created by IntelliJ IDEA.
  User: 电脑
  Date: 2025/4/2
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--isErrorPage属性允许jsp使用exception打印错误信息--%>
<%@ page isErrorPage="true"%>
<html>
<head>
    <title>error</title>
</head>
<body>
<h1>出错啦</h1>
<%
    exception.printStackTrace();
%>

</body>
</html>
