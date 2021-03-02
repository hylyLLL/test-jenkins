<#include "sidebar.ftl">
<div xmlns="http://www.w3.org/1999/html">
    <a href="/addItem">添加清单</a><br/>
    <#if listInfo??>
        <#list listInfo as item>
            <li>
                <form action="changeListStatus">
                    <input type="hidden" name="id" value="${item.id}"/>
                    <label>
                        <input type="checkbox"
                               onchange="submitForm(this)"
                               name="choice" value="${item.choice!}"
                               <#if item.choice==1>checked</#if>/>${item_index+1}
                        ${item.description!}
                    </label>
                </form>
            </li>
        </#list>
        </ul>
    </#if>
</div>
<style>
    ul li, li {
        list-style-type: none;
        margin: 0px;
        padding: 0px;
    }
</style>

<script>
    function submitForm(obj) {
        var fm = obj.parentNode.parentNode;
/*        var choice = obj.checked ? 1 : 0;
        fm.getElementsByTagName("input")[0].value = "" + choice;
        fm=obj.parentNode.parentNode;*/
        fm.submit();
    }
</script>
