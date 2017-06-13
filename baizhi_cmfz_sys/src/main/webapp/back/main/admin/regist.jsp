
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/back/easyui/css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/back/easyui/css/themes/icon.css">
    <script src="${pageContext.request.contextPath}/back/easyui/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/back/easyui/js/jquery.easyui.min.js"></script>
    <script src="${pageContext.request.contextPath}/back/easyui/js/form.validator.rules.js"></script>
    <script src="${pageContext.request.contextPath}/back/easyui/js/easyui-lang-zh_CN.js"></script>
    <script>
        $(function () {
            $("#uname").textbox({
                 prompt:'username'
            })
            $('#pwd').passwordbox({
                prompt:'password',
            });
        })
        function test() {
            $("#ff").submit()
        }
    </script>

</head>
<body>
<div style="margin: auto; margin-top:10%;margin-left: 30%">
    <form id="ff" method="post" action="${pageContext.request.contextPath}/admin/regist">
    <input id="uname"   name="name" style="width:300px">
    <br><input id="pwd"  name="password" style="width:300px"><br>
        <a class="easyui-linkbutton" onclick="test()">点击注册</a>
        <a class="easyui-linkbutton" href="login.jsp" >返回登陆</a>
    </form>
</div>
</body>
</html>
