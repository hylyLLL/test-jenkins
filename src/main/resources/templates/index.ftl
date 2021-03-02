<!DOCTYPE html>
<html lang="en">
<head>
    <#include "sidebar.ftl">
    <meta charset="UTF-8">
    <title>首页</title>
</head>
<body>
<div id="main">
    <div style="width:100%;height: 10px">
        <span style="float: right;margin-right: 50px;">
            <#if Session["SESSION_USER_KEY"]?exists> 用户名：${Session.SESSION_USER_KEY.username}</#if>
        </span>
    </div>
    <@menu/>
    <div style="width: 92%;height: 100%;float: left">
        <iframe id="content" src="/importFile" style="border: 0px;width: 100%;height: 100%;" scrolling="none" ;>
            <p>Your browser does not support iframes.</p>
        </iframe>
    </div>
</div>
</body>
<@style/>
<@script/>
</html>
