<%--
  Created by IntelliJ IDEA.
  User: 周涵
  Date: 2019/10/23
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <li><a href="${pageContext.request.contextPath}/ins/Emefindall.do">查找应急机构信息</a></li>
    <li><a href="${pageContext.request.contextPath}/ins/EmeInsupdate.do">修改应急机构信息</a></li>
</div>
<div class ="section">
    `    <form action="${pageContext.request.contextPath}/dir/Emefindall.do" method="post">
    <p>输入演练编号:&nbsp;<input size="7px" type="text" name="finddirnum" id="finddirnum">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="搜&nbsp;&nbsp;索"></p>
</form>
    <table border="1">
        <thead>
        <tr>
            <td>演练编号</td><td>计划名称</td><td >年度</td><td >负责人</td><td >上传人</td><td >上传时间</td><td>备注</td><td>上传文件</td>
        </tr>

        </thead>
        <tbody>
        <c:forEach var="d" items="${emeInsInfos}">
            <tr>
                <td>${d.dirll_num}</td>
                <td>${d.dirll_name}</td>
                <td>${d.dirll_year}</td>
                <td>${d.employ_num}</td>
                <td>${d.admin_id}</td>
                <td>${d.dirll_date}</td>
                <td>${d.dirll_note}</td>
                <td>${d.dirll_path}</td>

                <td class="text-center">
                    <a href="${pageContext.request.contextPath}/dir/EmeDirupdate.do">更新</a>
                    <a href="${pageContext.request.contextPath}/dir/EmeDirdelete.do?drill_num=${d.dirll_name}" >删除</a>
                </td>
            </tr>
        </c:forEach>


        </tbody>
    </table>
</div>

</body>
</html>