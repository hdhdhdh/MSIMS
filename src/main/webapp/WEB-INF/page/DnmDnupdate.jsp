<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/22
  Time: 21:21
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
        <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;粉尘、噪音浓度检测</h1>
    </div>
    <div id='nav'>
        <ul>

            <li><a href="${pageContext.request.contextPath}/dnm/todnadd.do">新增采样记录</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/todnfind.do">查询采样记录</a> </li>
            <li><a href="${pageContext.request.contextPath}/dnm/main.do">返回至主界面</a> </li>
        </ul>
    </div>

    <div id='main'>
        <h2>修改采样记录</h2>


        <form method="post" action="/dnm/dnupdate.do "  >
            <p>记录编号:&nbsp;<input size="5px" TYPE="text" NAME="duno_num" id="duno_num" value="${dnu.duno_num}" readonly="true"></p>
            <p>采样点ID:&nbsp;<input size="5px" TYPE="text" NAME="site_id" id="site_id" value="${dnu.site_id}"></p>
            <p>粉尘一号检测项:&nbsp;<input size="3px" TYPE="text" NAME="duno_dust1" id="duno_dust1" value="${dnu.duno_dust1}">
                &nbsp;&nbsp;&nbsp;粉尘二号检测项:&nbsp;<input size="3px" TYPE="text" NAME="duno_dust2" id="duno_dust2" value="${dnu.duno_dust2}">
                &nbsp;&nbsp;&nbsp;粉尘三号检测项:&nbsp;<input size="3px" TYPE="text" NAME="duno_dust3" id="duno_dust3" value="${dnu.duno_dust3}"></p>
            <p>噪声一号检测项:&nbsp;<input size="3px" TYPE="text" NAME="duno_noise1" id="duno_noise1" value="${dnu.duno_noise1}">
                &nbsp;&nbsp;&nbsp;噪声二号检测项:&nbsp;<input size="3px" TYPE="text" NAME="duno_noise2" id="duno_noise2" value="${dnu.duno_noise2}">
                &nbsp;&nbsp;&nbsp;噪声三号检测项:&nbsp;<input size="3px" TYPE="text" NAME="duno_noise3" id="duno_noise3" value="${dnu.duno_noise3}"></p>
            <p>隔音室:&nbsp;<input size="3px" TYPE="text" NAME="duno_room" id="duno_room" value="${dnu.duno_room}"></p>
            <p>检测人:&nbsp;<input size="8px" TYPE="text" NAME="duno_name" id="duno_name" value="${dnu.duno_name}"></p>
            <p>检测日期:&nbsp;<input size="10px" TYPE="date" NAME="duno_date" id="duno_date" value="${dnu.duno_date}"></p>
            <input type="submit" value="修&nbsp;&nbsp;改" name="dnm_update" id="dnm_update"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="取&nbsp;&nbsp;消">

        </form>


    </div>

</div>

</body>
</html>
