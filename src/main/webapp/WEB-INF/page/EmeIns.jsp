<%--
  Created by IntelliJ IDEA.
  User: 周涵
  Date: 2019/10/23
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel = "stylesheet" type="text/css" href="../../css/Eme.css">
    <title>应急机构信息管理</title>
</head>

<body>

<div class = "header">
    <h1>应急机构信息管理</h1>
</div>

<div class ="nav">
    <li><a href="${pageContext.request.contextPath}/main/EmeMain.do">主&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp页</a> </li>
    <li><a href="${pageContext.request.contextPath}/ins/EmeInsadd.do">增加应急机构信息</a></li>
    <li><a href="${pageContext.request.contextPath}/ins/EmeInsdelete.do">删除应急机构信息</a></li>
    <li><a href="${pageContext.request.contextPath}/ins/EmeInsfind.do">查找应急机构信息</a></li>
    <li><a href="${pageContext.request.contextPath}/ins/EmeInsupdate.do">修改应急机构信息</a></li>
</div>
<div class ="section">
    <h1>欢迎</h1>
</div>

</body>
</html>

