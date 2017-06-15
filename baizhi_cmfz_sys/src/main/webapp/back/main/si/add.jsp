<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<div style="text-align: center;">
    <form id="aForm" method="post" enctype="multipart/form-data">
        <div style="margin-top: 70px;">
            标题：<input name="title" class="easyui-textbox" data-options="required:true"/>
        </div>
        <div style="margin-top: 10px;">
            大师姓名：<input name="name" class="easyui-textbox" data-options="required:true"/>
        </div>
        <div style="margin-top: 10px;">
            封面图：<input name="aaa" type="file"/>
        </div>

        <%--<div style="margin-top: 10px;">
            发表日期：<input name="date" class="easyui-textbox" data-options="required:true"/>
        </div>--%>
        <div style="margin-top: 10px;">
            类型：<input name="type" class="easyui-textbox" data-options="required:true"/>
        </div>
        <div style="margin-top: 10px;">
            内容：<textarea name="txt"/>
            <%--<input name="txt" class="easyui-textbox" data-options="required:true"/>--%>
        </div>



    </form>
</div>