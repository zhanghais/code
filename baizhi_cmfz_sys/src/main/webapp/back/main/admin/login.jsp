
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
        $(function(){
            $('#tb').textbox({
                prompt:'username',
                iconCls:'icon-man',
                iconAlign:'left',
                validType:'username'
            })

            $('#pb').passwordbox({
                prompt: 'Password',
                showEye: true,
                validType:'password',
            });
        });
        function test() {
            $("#ff").submit()
        }
    </script>
</head>
<body>
<div  style=" margin:0 auto;margin-top: 150px; width: 300px;height: 200px; ">
    <form method="post" action="${pageContext.request.contextPath}/admin/login"  id="ff" novalidate="false">

    <input id="tb" type="text" style="width:300px" align="center" name="name"><br>

    <input id="pb" type="text" style="width:300px" align="center" name="password">
    <a class="easyui-linkbutton" onclick="test()">登陆</a>
        <a h class="easyui-linkbutton" href="regist.jsp">注册</a>
    </form>
</div>
</body>
</html>
