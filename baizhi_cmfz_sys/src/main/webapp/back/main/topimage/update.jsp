<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/12 0012
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<div style="text-align: center;">
    <form id="inputForm" method="post">
            <div style="margin-top: 70px;">
                <input name="id" type="hidden" value="${param.id}">

            </div>
        <div style="margin-top: 10px;">
            描述:<input  name="description" class="easyui-textbox" data-options="required:true"/><br/>
        </div>
    </form>
</div>
<script>

    $(function(){
        //构建子页面元素的操作
        console.log("${param.id}");
        $("#inputForm").form('load','${pageContext.request.contextPath}/image/queryById?id='+'${param.id}');

    });
</script>