<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<div style="text-align: center;">
    <form id="aForm" method="post" enctype="multipart/form-data">
        <div style="margin-top: 70px;">
            分数：<input name="score" class="easyui-textbox" data-options="required:true"/>
        </div>
        <div style="margin-top: 10px;">
            标题：<input name="title" class="easyui-textbox" data-options="required:true"/>
        </div>
        <div style="margin-top: 10px;">
            作者：<input name="author" class="easyui-textbox" data-options="required:true"/>
        </div>
        <div style="margin-top: 10px;">
            封面图：<input name="aaa" type="file"/>
        </div>
        <div style="margin-top: 10px;">
            选择音频文件：<input name="bbb" type="file" multiple/>
        </div>
        <div style="margin-top: 10px;">
            播音：<input name="broadscast" class="easyui-textbox" data-options="required:true"/>
        </div>
        <div style="margin-top: 10px;">
            内容简介：<input name="txt" class="easyui-textbox" data-options="required:true"/>
        </div>
    </form>
</div>