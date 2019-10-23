<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/22
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>j井下有害气体检测</title>
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
            width: 1100px;
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
        <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;井下有害气体检测</h1>
    </div>
    <div id='nav'>
        <ul>

            <li><a href="${pageContext.request.contextPath}/dnm/tomineadd.do">新增采样记录</a> </li>
            <li><a href="">查询采样记录</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/main.do">返回至主界面</a> </li>
        </ul>
    </div>
    <div id='main'>
        <h2>查询采样记录</h2>

        <form action="${pageContext.request.contextPath}/dnm/mineidfind.do" method="post">
            <p>输入采样点ID:&nbsp;<input size="7px" type="text" name="site_id" id="site_id">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="搜&nbsp;&nbsp;索"></p>
        </form>
        <form action="${pageContext.request.contextPath}/dnm/minedatefind.do" method="post">
            <p>输入时间日期:&nbsp;<input size="7px" type="date" name="mine_date" id="mine_date">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="搜&nbsp;&nbsp;索"></p>
        </form>
        <table border="1">
            <thead>
            <tr>
                <td>编号</td><td>采样点ID</td><td>实测风速</td><td>面积</td><td>风量</td><td>风向</td><td>粉尘</td><td>一氧化碳</td><td>温度</td><td>检测人</td><td>检测日期</td><td>操作</td>
            </tr>

            </thead>
            <tbody>
            <c:forEach var="m" items="${dnmmineinfos}">
                <tr>
                <td>${m.mine_num}</td>
                <td>${m.site_id}</td>
                <td>${m.mine_speed}</td>
                <td>${m.mine_area}</td>
                <td>${m.mine_amount}</td>
                <td>${m.mine_direct}</td>
                <td>${m.mine_dust}</td>
                <td>${m.mine_co}</td>
                <td>${m.mine_temp}</td>
                <td>${m.mine_name}</td>
                <td>${m.mine_date}</td>

                <td class="text-center">
                    <a href="${pageContext.request.contextPath}/dnm/tomineupdate.do?mine_num=${m.mine_num}" >更新</a>&nbsp;
                    <a href="${pageContext.request.contextPath}/dnm/minedelete.do?mine_num=${m.mine_num}" >删除</a>&nbsp;
                    <a href="${pageContext.request.contextPath}/dnm/mineidfindexcel.do?site_id=${m.site_id}">ID</a>&nbsp;
                    <a href="${pageContext.request.contextPath}/dnm/minedatefindexcel.do?mine_date=${m.mine_date}">时间</a>
                </td>
                </tr>

            </c:forEach>


            </tbody>
        </table>

    </div>

</div>

</body>
</html>
