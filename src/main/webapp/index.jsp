<%--
  Created by IntelliJ IDEA.
  User: lxf
  Date: 2019/3/27
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<% String Path=request.getContextPath();
  String basePath=request.getScheme()+"://";%>
<head>
  <meta charset="UTF-8">
  <title>test</title>
</head>
<script>
    function selectUser() {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                document.getElementById("test").innerHTML = xmlhttp.responseText;
            }
        }
        xmlhttp.open("POST", "user/showUser.do", true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.send("id=1");
    }
</script>
<body>
<p id="test">Hello World!</p>
<button type="button" onclick="selectUser()">onclick test</button>
<a href="<%=Path%>/index.do" >hello</a>
</body>
</html>
