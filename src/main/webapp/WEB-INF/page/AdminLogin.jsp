<%--
  Created by IntelliJ IDEA.
  User: SXX
  Date: 2019/10/22
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>矿山安全信息管理平台</title>
    <style>
        body{
            background-image: url("../../imge/loginback .jpg");
            background-size: 100% auto;
            background-repeat: no-repeat;
        }

        .main{
            text-align: center;
            padding: 50px 0px;
            margin: 0 auto;
        }
        #login_frame {
            width: 40%;
            height: 360px;
            padding: 13px;

            position: absolute;
            left: 43%;

            top: 50%;
            margin-left: -200px;
            margin-top: -200px;

            background-color: rgba(240, 255, 255, 0.5);

            border-radius: 10px;
            text-align: center;
            align-items: center;
        }

        form p > * {
            display: inline-block;
            vertical-align: middle;
        }

        h2{
            text-align: center;
            font-size: 2rem;
            font-family: "幼圆";
            color: #885886;
            line-height: 80px;
        }

        .text_field {
            width: 300px;
            height: 40px;
            text-align: center;
            font-size: 18px;
            font-weight: 300;
            border-radius: 15px;

            border: 0;
        }

        button {
            font-size: 18px;
            font-family:幼圆;

            width: 120px;
            height: 35px;
            line-height: 28px;
            text-align: center;

            color: white;
            background-color: #41f7ff;
            border-radius: 10px;
            border: 0;


        }



    </style>
</head>
<body>
<div class="main">

    <div id="login_frame">
        <h2>矿山安全信息管理平台</h2>
        <form method="post" action="/adminlogin.do">
            <p><input type="text" id="username" name = "admin_id"placeholder="员工编号"  class="text_field"/> </p>
            <p><input type="password" id="password" name = "admin_password"placeholder="员工初始密码统一为编号" class="text_field"/> </p>

            <p><button  type="submit" value="登录" onclick="login();">登&nbsp;&nbsp;录</button></p>
            ${err}
        </form>
    </div>
</div>
</body>
</html>
