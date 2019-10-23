<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/23
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>危害信息检测分析</title>
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

            float:left;
            text-align: center;
            align-items: center;
            font-size: 15px;
        }
        h2{
            font-size:25px;
            font-family: 幼圆;
            color: chartreuse;
            text-align: center;

        }
        input[type="submit"]{
            font-family:幼圆;
            border-radius: 5px;

        }
        table{
            margin: auto;
            width: 1150px;
            border: 2px solid #faa5ff;
            border-spacing: 0;
            text-align: center;
            font-family: 宋体;
            border-radius: 5px;
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
        <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;危害信息检测分析</h1>
    </div>
    <div id='nav'>
        <ul>

            <li><a href="${pageContext.request.contextPath}/dnm/tostaDfind.do">双重条件搜索</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/tostaTfind.do">时间条件搜索</a> </li>
            <li><a href="">搜寻指定类别</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/main.do">返回至主界面</a> </li>
        </ul>
    </div>
    <div id='main'>
        <h2>搜寻指定类型</h2>


    </div>

</div>

</body>
</html>
