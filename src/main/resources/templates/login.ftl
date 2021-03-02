<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
</head>
<body>
    <div style="width: 260px;margin: auto auto;text-align: center;">
        <#if msg??>
            <span style="color: red;size: 20px">${msg}</span>
        </#if>
        <form action="/postLogin">
            用户名：<input type="text" name="username"/>
            密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" style="margin: 5px 0px;"/>
            <input type="submit" name="登录"/>
        </form>
    </div>
</body>
</html>
