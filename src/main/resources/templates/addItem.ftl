<form id="addListInfo" action="/addListInfo" >
    清单描述：<input name="description" required type="text"/>
    步&nbsp;&nbsp;骤：<input type="number"  required  name="sort" min="1" <#if maxStep??>max="${maxStep!}" <#else> max="1"</#if>/>
    <input type="submit" value="添加"/>
</form>

