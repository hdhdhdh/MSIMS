<%--
  Created by IntelliJ IDEA.
  User: fangyichuan
  Date: 2019/10/23
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/quelcss.css">
    <title>主界面</title>
</head>
<body>
<div id="switcher">
    <div class="center">
        <ul>
            <li class="logoTop">
                <a>企业资质证书管理</a>
            </li>
        </ul>
    </div>
</div>
<div class="top">
    <div class="top1">
        <ul id="nav" class="nav clearfix">
            <li class="nLi on" style="border-left: 0;">
                <h1>
                    <a href="LxmExpireQuel.jsp" target="_blank">公司资质证书预警</a>
                </h1>
            </li>
            <li class="nLi">
                <h1>
                    <a href="LxmQuel-list.jsp" target="_blank">公司资质证书管理</a>
                </h1>
            </li>
        </ul>
    </div>
</div>
<div class="section">
    <div class="expired">
        <table id="expireddataList">
            <caption>已过期的公司资质证书信息</caption>
            <thead>
            <tr>
                <th>证书编号</th>
                <th>证书类型</th>
                <th>有效期（起）</th>
                <th>有效期（止）</th>
                <th>发证机关</th>
                <th>发证时间</th>
                <th>上传人</th>
                <th>上传时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="#" items="${ps.list}">
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="expiring">
        <table id="expiringdataList">
            <caption>即将过期的公司资质证书信息</caption>
            <thead>
            <tr>
                <th>证书编号</th>
                <th>证书类型</th>
                <th>有效期（起）</th>
                <th>有效期（止）</th>
                <th>发证机关</th>
                <th>发证时间</th>
                <th>上传人</th>
                <th>上传时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="#" items="${ps.list}">
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
                <td>${user.id}</td>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
