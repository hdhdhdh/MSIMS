<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/23
  Time: 21:21
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

            <li><a href="">双重条件搜索</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/tostaTfind.do">时间条件搜索</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/tostaCfind.do">搜寻指定类别</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/main.do">返回至主界面</a> </li>
        </ul>
    </div>
    <div id='main'>
        <h2>双重条件搜索</h2>
        <form action="${pageContext.request.contextPath}/dnm/staDfind.do" method="post">
            <p>输入需要查询采样点的名称:&nbsp;<input size="7px" type="text" name="site_place" id="site_place"></p>
            <p>请输入需要查询的时间：&nbsp;&nbsp;<input size="7px" type="date" name="date" id="date"></p>
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
            <c:forEach var="dn" items="${dndateid}">
                <tr>
                    <td width="50px">${dn.duno_num}</td>
                    <td width="80px">${dn.site_id}</td>
                    <td width="60px">${dn.duno_dust1}</td>
                    <td width="60px">${dn.duno_dust2}</td>
                    <td width="60px">${dn.duno_dust3}</td>
                    <td width="60px">${dn.duno_dusta}</td>
                    <td width="60px">${dn.duno_noise1}</td>
                    <td width="60px">${dn.duno_noise2}</td>
                    <td width="60px">${dn.duno_noise3}</td>
                    <td width="60px">${dn.duno_noisea}</td>
                    <td width="60px">${dn.duno_room}</td>
                    <td>${dn.duno_name}</td>
                    <td>${dn.duno_date}</td>
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
            <c:forEach var="dm" items="${dmdateid}">
                <tr>
                    <td>${dm.mine_num}</td>
                    <td>${dm.site_id}</td>
                    <td>${dm.mine_speed}</td>
                    <td>${dm.mine_area}</td>
                    <td>${dm.mine_amount}</td>
                    <td>${dm.mine_direct}</td>
                    <td>${dm.mine_dust}</td>
                    <td>${dm.mine_co}</td>
                    <td>${dm.mine_temp}</td>
                    <td>${dm.mine_name}</td>
                    <td>${dm.mine_date}</td>
                </tr>
            </c:forEach>


            </tbody>
        </table>

    </div>

</div>

</body>
</html>
