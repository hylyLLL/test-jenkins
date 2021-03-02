<table border="1" cellspacing="0" cellpadding="10">

    <tr>
        <th>所属车辆</th>
        <th>设备类型id</th>
        <th>设备名称</th>
        <th>卡号</th>
        <th>卡片类型</th>
        <th>路数</th>
        <th>生产日期</th>
        <th>规格</th>
        <th>协议配置项id</th>
        <th>终端类型</th>
    </tr>
    <#list listAll! as item>
        <tr>
            <td>${item.carInfoId!}</td>
            <td>${item.deviceTypeId!}</td>
            <td>${item.name!}</td>
            <td>${item.cardNo!}</td>
            <td>${item.cardType!}</td>
            <td>${item.pathType!}</td>
            <td>${item.pro_time!}</td>
            <td>${item.spec!}</td>
            <td>${item.protocolDetailId!}</td>
            <td>${item.dataType!}</td>
        </tr>
    </#list>
</table>
