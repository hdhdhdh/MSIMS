<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/22
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>采样点管理</title>
    <style>


        #box{
            width:1400px;
            margin:0 auto;

        }
        #logo{
            font-family: "幼圆";
            font-size: 20px;
            color: #6cdbff;
            font-weight: bold;
            text-align: center;
            margin-top: 30px;
            margin-bottom: 40px;
        }
        #nav {
            border-radius: 15px;
            display: inline-block;
            width: 200px;
            height: 250px;
            float: left;
            background-color: lightcyan;
            margin-right: 0px;

        }
        #nav ul{
            line-height: 45px;
            list-style-type: none;
            padding: 35px;
            text-align: center;
        }
        #nav a{
            text-decoration:none;
            font-family: 幼圆;
            color: #e722ff;
            font-weight: bold;
            font-size: 20px;

        }
        #main{
            border-radius: 15px;
            display:inline-block;
            width:1200px;
            height:600px;
            background-color: antiquewhite;
            text-align: center;
            align-items: center;

            float:left;
        }

        table{
            margin: auto;
            width: 600px;
            border: 2px solid #faa5ff;
            border-spacing: 0;
            text-align: center;
            font-family: 宋体;
            border-radius: 5px;
            margin-top: 100px;
        }
        a{
            color: #791388;
            font-family: 幼圆;
            text-decoration: none;
            font-weight: bold;
        }


    </style>
</head>
<body>
<div id='box'>
    <div id='logo'>
        <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;采样点管理</h1>
    </div>
    <div id='nav'>
        <ul>

            <li><a href="${pageContext.request.contextPath}/dnm/sitemain.do">采样点主界面</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/tositeadd.do">新增样点信息</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/main.do">返回至主界面</a> </li>
        </ul>
    </div>
    <div id='main'>
        <table border="1">
            <thead>
            <tr>
                <td>采样点ID</td><td width="300px">采样点名称</td><td width="150px">操作</td>
            </tr>

            </thead>
            <tbody>
            <c:forEach var="s" items="${dns}">

                <tr>
                <td>${s.site_id}</td>
                <td>${s.site_place}</td>


                <td >
                    <a href="${pageContext.request.contextPath}/dnm/tositeupdate.do?site_id=${s.site_id}" >更改</a>&nbsp;
                    <a href="${pageContext.request.contextPath}/dnm/sitedelete.do?site_id=${s.site_id}" >删除</a>
                </td>
                </tr>

            </c:forEach>


            </tbody>
        </table>

    </div>

</div>

</body>
</html>
