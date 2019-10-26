<%--
  Created by IntelliJ IDEA.
  User: 姬鹏辉
  Date: 2019/10/22
  Time: 8:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>主页</title>

    <%--<link href="css/bootstrap.min.css" rel="stylesheet">--%>

</head>
<body>

    <%--<a href="teacher/find/1">根据id查找Teacher</a>--%>

    <%--<form action="teacher/transfer" method="post">--%>
        <%--<input type="text" name="tname" placeholder="请输入转出用户" />--%>
        <%--<input type="text" name="sname" placeholder="请输入转入用户">--%>
        <%--<input type="text" name="money" placeholder="请输入转账金额"/>--%>
        <%--<input type="submit" value="转账">--%>
    <%--</form>--%>

    <form action="login/getVeriCode" method="post" />
        <input type="text" name="name" placeholder="请输入用户名"><br>
        <input type="text" id="code" value="${code}" />
        <input type="button" id="getVeriCode" onclick="getVeriCode()" value="获取验证码"><br>
        <input type="text" name="code" placeholder="请输入验证码" />
        <input type="submit" value="登陆">
    </form>

</body>

<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script type="javascript">
    $("#getVeriCode").click(function() {
        $.ajax("login/getVeriCode",function(data) {
            $("#code").html(data);
        });
    });
    function getVeriCode () {
        window.location.assign("login/getVeriCode");
    }
</script>
</html>
