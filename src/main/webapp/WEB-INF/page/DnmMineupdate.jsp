<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/22
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>井下有害气体检测</title>
    <style>


        #box{
            width:1400px;
            margin:0 auto;
            font-size:14px;

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

        input{



            height: 25px;
            margin-top: 10px;
            margin-right: auto;

        }
        input[type="submit"]{
            width:70px;
            height: 30px;
            font-size: 15px;
            font-family:幼圆;
            font-weight: bold;
            text-align: center;
            border-radius: 5px;
            background-color: #f3f5fa;
            color: #9549ff;
        }
        input[type="reset"]{
            width:70px;
            height: 30px;
            font-size: 15px;
            font-family:幼圆;
            font-weight: bold;
            text-align: center;
            border-radius: 5px;
            background-color: #f3f5fa;
            color: #9549ff;
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
            <li><a href="${pageContext.request.contextPath}/dnm/tominefind.do">查询采样记录</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/main.do">返回至主界面</a> </li>
        </ul>
    </div>

    <div id='main'>
        <h2>修改采样记录</h2>

        <form method="post" action="${pageContext.request.contextPath}/dnm/mineupdate.do">
            <p>记录编号:&nbsp;<input size="5px" TYPE="text" NAME="mine_num" id="mine_num" value="${dum.mine_num}" readonly="true"></p>
            <p>采样点ID:&nbsp;<input size="5px" TYPE="text" NAME="site_id" id="site_id" value="${dum.site_id}"></p>
            <p>实测风速:&nbsp;<input size="3px" TYPE="text" NAME="mine_speed" id="mine_speed" value="${dum.mine_speed}">
                &nbsp;&nbsp;&nbsp;面积:&nbsp;<input size="3px" TYPE="text" NAME="mine_area" id="mine_area" value="${dum.mine_area}">
                &nbsp;&nbsp;&nbsp;风量:&nbsp;<input size="3px" TYPE="text" NAME="mine_amount" id="mine_amount" value="${dum.mine_amount}">
                &nbsp;&nbsp;&nbsp;风向:&nbsp;<input size="3px" TYPE="text" NAME="mine_direct" id="mine_direct" placeholder="进/出" value="${dum.mine_direct}">
            <p>粉尘:&nbsp;<input size="3px" TYPE="text" NAME="mine_dust" id="mine_dust" value="${dum.mine_dust}">
                &nbsp;&nbsp;&nbsp;一氧化碳:&nbsp;<input size="3px" TYPE="text" NAME="mine_co" id="mine_co" value="${dum.mine_co}">
                &nbsp;&nbsp;&nbsp;温度:&nbsp;<input size="3px" TYPE="text" NAME="mine_temp" id="mine_temp" value="${dum.mine_temp}">
            </p>
            <p>检测人:&nbsp;<input size="8px" TYPE="text" NAME="mine_name" id="mine_name" value="${dum.mine_name}"></p>
            <p>检测日期:&nbsp;<input size="10px" TYPE="date" NAME="mine_date" id="mine_date" value="${dum.mine_date}"></p>
            <input type="submit" value="修&nbsp;&nbsp;改" name="mine_upate" id="mine_update"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="取&nbsp;&nbsp;消">

        </form>


    </div>

</div>

</body>
</html>
