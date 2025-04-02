<%--
  Created by IntelliJ IDEA.
  User: 电脑
  Date: 2025/3/31
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--errorPage属性允许页面出错时，跳转到指定的错误页面--%>
<%@ page errorPage="error.jsp" %>

<html>
<head>
    <title>Cookie</title>
</head>
<body>
<%
    //空指针异常
    String name = null;
    name.toString();
%>
 <a href="<%=request.getContextPath()%>/cookie/generate">服务器生成cookie，然后将cookie响应给浏览器，浏览器接收cookie，将cookie放到客户端上</a>
<a href="<%=request.getContextPath()%>/sendcookie">点击向服务器发送cookie</a>
</body>
</html>
