<%--
  Created by IntelliJ IDEA.
  User: 周涵
  Date: 2019/10/23
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel = "stylesheet" type="text/css" href="../../css/Eme.css">
    <title>应急演练信息管理</title>
</head>

<body>

<div class = "header">
    <h1>应急演练信息管理</h1>
</div>

<div class ="nav">
    <li><a href="${pageContext.request.contextPath}/main/EmeMain.do">主&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp页</a> </li>
    <li><a href="${pageContext.request.contextPath}/dir/toEmeDiradd.do">增加应急演练信息</a></li>
    <li><a href="${pageContext.request.contextPath}/dir/toEmeDirdelete.do">删除应急演练信息</a></li>
    <li><a href="${pageContext.request.contextPath}/dir/EmeDirfind.do">查找应急演练信息</a></li>
    <li><a href="${pageContext.request.contextPath}/dir/toEmeDirupdate.do.do">修改应急演练信息</a></li>
</div>
<div class ="section">
    <h1>欢迎</h1>
</div>

</body>
</html>