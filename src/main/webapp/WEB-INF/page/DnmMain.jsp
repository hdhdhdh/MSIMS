<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/22
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta charset="UTF-8">
    <title>作业场所危害检测</title>
</head>
<style>
    h1{
        font-family: "华文行楷";
        font-size: 65px;
        color: red;
        font-weight: bold;
        text-align: center;
    }
    h2{
        font-family: "宋体";
        font-size: 30px;
        color: #43b5ff;
        font-weight: bold;
        text-align: center;
    }
    h6{
        font-family: "宋体";
        font-size: 15px;
        position: fixed;
        bottom: 0px;
        width: 100%;
        color: red;
        text-align: center;
    }
    .box{
        text-align: center;
    }
    button{
        font-family: "幼圆";
        font-size: 16px;
        background-color: antiquewhite;
        color: #844a88;
        text-align: center;
        width: 160px;
        height: 200px;
        border-radius: 10px;
        border:0;
    }
    button:hover{
        background-color: aqua;
    }
</style>
<br>
<h1>安&nbsp;&nbsp;全&nbsp;&nbsp;生&nbsp;&nbsp;产&nbsp;&nbsp;&nbsp;人&nbsp;&nbsp;人&nbsp;&nbsp;有&nbsp;&nbsp;责</h1>
<h2>作业场所危害检测主界面</h2>
<h3>&nbsp;</h3>
<div class="box">
    <a href="${pageContext.request.contextPath}/dnm/dnmain.do"><button>粉尘、噪音浓度检测</button></a>
    <a href="${pageContext.request.contextPath}/dnm/minemain.do"><button>井下有害气体检测</button></a>
    <a href="${pageContext.request.contextPath}/dnm/sitemain.do"><button>采样点管理</button></a>
    <a href="${pageContext.request.contextPath}/dnm/stamain.do"><button>危害信息检测分析</button></a>
</div>
<h6>周氏集团互联网有限子公司权限所有</h6>
</body>
</html>
