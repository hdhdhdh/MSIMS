<%--
  Created by IntelliJ IDEA.
  User: 周涵
  Date: 2019/10/23
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel = "stylesheet" type="text/css" href="../../css/Eme.css">
    <title>应急预案信息管理</title>
</head>

<body>

<div class = "header">
    <h1>应急预案信息管理</h1>
</div>

<div class ="nav">
    <li><a href="${pageContext.request.contextPath}/main/EmeMain.do">主&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp页</a> </li>
    <li><a href="${pageContext.request.contextPath}/plan/EmePlanadd.do">增加应急预案信息</a></li>
    <li><a href="${pageContext.request.contextPath}/plan/EmePlandelete.do">删除应急预案信息</a></li>
    <li><a href="${pageContext.request.contextPath}/plan/EmePlanfind.do">查找应急预案信息</a></li>
    <li><a href="${pageContext.request.contextPath}/plan/EmePlanupdate.do">修改应急预案信息</a></li>
</div>
<div class ="section">
    <h1>欢迎</h1>
</div>

</body>
</html>
