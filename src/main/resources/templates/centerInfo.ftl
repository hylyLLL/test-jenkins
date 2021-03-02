<table border="1" cellspacing="0" cellpadding="10">

    <tr>
        <th>中心名称</th>
        <th>地址</th>
        <th>中心负责人</th>
        <th>联系电话</th>
        <th>站点围栏距离</th>
    </tr>
    <#list listAll as item>
        <tr>
            <td>${item.name!}</td>
            <td>${item.address!}</td>
            <td>${item.principal!}</td>
            <td>${item.telphone!}</td>
            <td>${item.distanceRange!}</td>
        </tr>
    </#list>
</table>
