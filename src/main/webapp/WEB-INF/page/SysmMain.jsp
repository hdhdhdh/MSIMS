<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
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
        .box0{
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
    <title>安全制度与体系管理</title>
</head>
<body>
<h1>安全制度与体系管理</h1>
<h2></h2>
<h3></h3>
<div class="box0">
    <a href="${pageContext.request.contextPath}/sysm/lawfindall.do"><button>安全生产法律法规</button></a>
    <a href="${pageContext.request.contextPath}/sysm/prevefindall.do"><button>双重预防机制文件</button></a>
</div>
<h6>周氏集团互联网子公司权限所有</h6>
</body>
</html>