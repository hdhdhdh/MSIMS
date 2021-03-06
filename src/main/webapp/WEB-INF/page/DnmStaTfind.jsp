<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/23
  Time: 21:22
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
            <li><a href="">时间条件搜索</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/tostaCfind.do">搜寻指定类别</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/main.do">返回至主界面</a> </li>
        </ul>
    </div>
    <div id='main'>
        <h2>时间条件搜索</h2>

        <form action="${pageContext.request.contextPath}/dnm/staTfind.do" method="post">
            <p>请输入起始时间点:&nbsp;<input size="7px" type="date" name="date1" id="date1"></p>
            <p>请输入截止时间点:&nbsp;<input size="7px" type="date" name="date2" id="date2"></p>
            <p><input type="submit" value="搜&nbsp;&nbsp;索"></p>
        </form>

        <table  border="1">
            <thead>
            <tr>
                <td rowspan="2" width="50px">编号</td><td rowspan="2" width="80px">采样点ID</td><td colspan="4">粉尘</td><td colspan="5">噪音</td><td rowspan="2">检测人</td><td rowspan="2">检测日期</td>
            </tr>
            <tr>
                <td width="50px">一</td><td width="60px">二</td><td width="60px">三</td><td width="60px">平均值</td><td width="60px">一</td><td width="60px">二</td><td width="60px">三</td><td width="60px">平均值</td><td width="60px">隔音室</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="dnt" items="${dndates}">
                <tr>
                    <td width="50px">${dnt.duno_num}</td>
                    <td width="80px">${dnt.site_id}</td>
                    <td width="60px">${dnt.duno_dust1}</td>
                    <td width="60px">${dnt.duno_dust2}</td>
                    <td width="60px">${dnt.duno_dust3}</td>
                    <td width="60px">${dnt.duno_dusta}</td>
                    <td width="60px">${dnt.duno_noise1}</td>
                    <td width="60px">${dnt.duno_noise2}</td>
                    <td width="60px">${dnt.duno_noise3}</td>
                    <td width="60px">${dnt.duno_noisea}</td>
                    <td width="60px">${dnt.duno_room}</td>
                    <td>${dnt.duno_name}</td>
                    <td>${dnt.duno_date}</td>
                </tr>

            </c:forEach>

            </tbody>
        </table>
        <br>
        <table border="1">
            <thead>
            <tr>
                <td>编号</td><td>采样点ID</td><td>实测风速</td><td>面积</td><td>风量</td><td>风向</td><td>粉尘</td><td>一氧化碳</td><td>温度</td><td>检测人</td><td>检测日期</td>
            </tr>

            </thead>
            <tbody>
            <c:forEach var="dmt" items="${dmdates}">
                <tr>
                    <td>${dmt.mine_num}</td>
                    <td>${dmt.site_id}</td>
                    <td>${dmt.mine_speed}</td>
                    <td>${dmt.mine_area}</td>
                    <td>${dmt.mine_amount}</td>
                    <td>${dmt.mine_direct}</td>
                    <td>${dmt.mine_dust}</td>
                    <td>${dmt.mine_co}</td>
                    <td>${dmt.mine_temp}</td>
                    <td>${dmt.mine_name}</td>
                    <td>${dmt.mine_date}</td>
                </tr>
            </c:forEach>


            </tbody>
        </table>

    </div>

</div>

</body>
</html>
