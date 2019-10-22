<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/22
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>粉尘、噪音浓度检测</title>
    <style>


        #box{
            width:1200px;
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
            width:1000px;
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
            width: 920px;
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
        <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;粉尘、噪音浓度检测</h1>
    </div>
    <div id='nav'>
        <ul>

            <li><a href="${pageContext.request.contextPath}/dnm/todnadd.do">新增采样记录</a> </li>
            <li><a href="">查询采样记录</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/main.do">返回至主界面</a> </li>
        </ul>
    </div>
    <div id='main'>
        <h2>查询采样记录</h2>
        <form action="" method="post">
            <p>输入采样点ID:&nbsp;<input size="7px" type="text" name="finddnid" id="finddnid">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="搜&nbsp;&nbsp;索"></p>
        </form>
        <form action="" method="post">
            <p>输入时间日期:&nbsp;<input size="7px" type="text" name="finddndate" id="finddndate">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="搜&nbsp;&nbsp;索"></p>
        </form>
        <table border="1">
            <thead>
            <tr>
                <td rowspan="2" width="50px">编号</td><td rowspan="2">采样点id</td><td colspan="4">粉尘</td><td colspan="5">噪音</td><td rowspan="2">检测人</td><td rowspan="2">检测日期</td><td rowspan="2">操作</td>
            </tr>
            <tr>
                <td width="50px">一</td><td width="60px">二</td><td width="60px">三</td><td width="60px">平均值</td><td width="60px">一</td><td width="60px">二</td><td width="60px">三</td><td width="60px">平均值</td><td width="60px">隔音室</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="d" items="${}">
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>

                <td class="text-center">
                    <a href="" >更新</a>
                    <a href="" >删除</a>
                </td>

            </c:forEach>


            </tbody>
        </table>


    </div>

</div>

</body>
</html>
