<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/12 0012
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<div style="text-align: center;">
    <form id="addForm" method="post" enctype="multipart/form-data">
        <div style="margin-top: 70px;">
            <input name="aaa" type="file">
        </div>
        <div style="margin-top: 10px;">
            描述:<input  name="description" class="easyui-textbox" data-options="required:true"/><br/>
        </div>
    </form>
</div>