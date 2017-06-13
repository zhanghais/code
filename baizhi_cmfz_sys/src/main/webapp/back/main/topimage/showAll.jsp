<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
    <script>
        var $dg,$da;
        $(function () {
            $dg = $("#stDg");
            $da = $("#stDa");
            $dg.datagrid({
                url: '${pageContext.request.contextPath}/image/queryAll',
                fit:true,
                columns: [[
                    {title: "编号", field: "id", width: 200, align: 'center'},
                    {title: "描述", field: "description", width: 200, align: 'center'},
                    {title: "地址", field: "thumbnail", width: 200, align: 'center'},
                    {
                        title: "操作", field: "options", width: 200, align: 'center',
                        formatter: function (value, row, index) {
                            return "<a class='del' onClick=\"del('" + row.id + "')\" href='javascript:;'>删除</a>&nbsp;&nbsp;" +
                                    "<a class='edit' onClick=\"editRow('" + row.id + "')\"  href='javascript:;'>修改</a>";
                        }
                    }
                ]],
                onLoadSuccess: function (data) {
                    $(".del").linkbutton({
                        plain: true,
                        iconCls: 'icon-remove',

                    });
                    $(".edit").linkbutton({
                        plain: true,
                        iconCls: 'icon-edit',
                    });
                },
                pagination:true,
                pageNumber:2,
                pageSize:2,
                pageList:[2,4,6,8,10],
                toolbar:'#tb',
            });
        });

        //删除的操作
        function del(id){
            $.messager.confirm("提示","您确定要删除吗?",function(r){
                if(r){
                    $.post("${pageContext.request.contextPath}/image/delete",{"id":id});
                    $dg.datagrid('reload');
                }
            });
        }
        //修改的操作
        function editRow(id){
            $da.dialog({
                width:600,
                height:300,
                title:"图片的详细信息",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/main/topimage/update.jsp?id='+id,
                buttons:[{
                    text:'保存',
                    iconCls:'icon-save',
                    handler:saveStu,
                },{
                    text:'关闭',
                    iconCls:'icon-cancel',
                    handler:closeDa,
                }],
            });
        }
        function add() {
            $da.dialog({
                width:600,
                height:300,
                title:"添加图片",
                iconCls:"icon-man",
                href:'${pageContext.request.contextPath}/back/main/topimage/add.jsp',
                buttons:[{
                    text:'保存',
                    iconCls:'icon-save',
                    handler:saveStu,
                },{
                    text:'关闭',
                    iconCls:'icon-cancel',
                    handler:closeDa,
                }],
            });
        }
        //保存用户
        function saveStu(){
            $("#addForm").form('submit',{
                url:'${pageContext.request.contextPath}/image/add',
                success:function(){
                    $da.dialog('close',true);
                    $dg.datagrid('reload');
                }
            });
        }
        //关闭对话框
        function closeDa(){
            $da.dialog('close',true);
        }
        //搜索的处理程序
        function search(value,name){
            console.log(value);
            console.log(name);
            $dg.datagrid('load',{
                name:value
            });
        }

    </script>


    <div  class="easyui-layout" data-options="fit:true">
        <div data-options="region:'north'," style="height:50px;">
            <div style="text-align: center;margin: 10px 0px 10px 0px;">
                <input id="ss" class="easyui-searchbox" style="width:300px"
                       data-options="searcher:search,prompt:'Please Input Value',menu:'#mm'"/>
                <div id="mm" style="width:120px">
                    <div data-options="name:'name',iconCls:'icon-ok'">名称</div>
                    <div data-options="name:'age'">年龄</div>
                </div>
            </div>
        </div>
        <div data-options="region:'center',">
            <table id="stDg" ></table>


            <div id="stDa"></div>

            <div id="tb">
                <a href="#" onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">添加</a>
            </div>
        </div>
    </div>