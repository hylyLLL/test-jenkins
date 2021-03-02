<form id="formContent" action="import" enctype="multipart/form-data" method="post" onsubmit="waitTip()">
    <input type="file" name="file" id="file">
    <div id="importContainer" style="display: inline-block">
        <input type="submit" value="导入">
    </div>
</form>
<script>
    function waitTip() {
        var importContainer = document.getElementById("importContainer");
        importContainer.innerHTML = "<p>导入中,请等待...</p>";
        var file = document.getElementById("file");
        file.hidden = true;
    }
</script>
