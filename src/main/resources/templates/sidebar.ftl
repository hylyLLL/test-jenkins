<#macro menu>
    <div style="width: 7%;height: 100%;float: left;border-right: solid black 1px;">
        <ul>
            <#if menuList??>
                <#list menuList as menu>
                    <li>
                        <a href="javascript:void(0)" <#if (menu_index==0)>style="color: blue;" id="first" </#if> onclick="loadContent('${menu.url}',this)">
                            <span>${menu.name}</span>
                        </a>
                    </li>
                </#list>
            </#if>
        </ul>
    </div>
</#macro>

<#macro style>
    <style>
        a {
            font-size: 16px;
            text-decoration: none;
            color: black;
            display: inline-block;
            margin:5px 0px;
        }


        ul li,ul {
            list-style-type: none;
            padding: 0px;
            margin: 0px;
            text-align: center;
        }

    </style>
</#macro>
<#macro script>
      <script>
        window.onload=function (){
            var height = window.screen.height-200;
            document.getElementById("main").style.height=height+"px";
        };

        var pre =  document.getElementById("first");
        var ifm = document.getElementById("content");


        function loadContent(url, obj) {
            if (ifm != null) {
                ifm.src = url;
            }

            if (pre != null) {
                pre.style.color = "black";
            }
            obj.style.color = "blue";
            pre = obj;

        }
    </script>
</#macro>
