<html>
<body>
<h2>Hello World!</h2>
<a href="#" onclick="addTool()">addtool</a>
<a href="/tool/addTool" >addtool</a>
<script>
    function addTool() {
        $.get("/tool/addTool",{},function () {
                alert(1);
        })
    }
</script>
</body>
</html>
