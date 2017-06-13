<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<script>
    var $dg,$da;
    $(function () {
        $dg = $("#stDg");
        $da = $("#stDa");
        $dg.datagrid({
            url: '${pageContext.request.contextPath}/reflect/queryAll',
            fit:true,
            columns: [[
                {title: "编号", field: "id", width: 200, align: 'center'},
                {title: "描述", field: "description", width: 200, align: 'center'},
                {title: "日期", field: "date", width: 200, align: 'center'},
                {
                    title: "用户名", field: "user", width: 200, align: 'center',
                    formatter: function (value, row, index) {
                        return row.user.name;
                    }
                },
                {
                    title: "操作", field: "options", width: 200, align: 'center',
                    formatter: function (value, row, index) {
                        return "<a class='del' onClick=\"del('" + row.id + "')\" href='javascript:;'>删除</a>&nbsp;&nbsp;";
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
                $.post("${pageContext.request.contextPath}/reflect/delete",{"id":id});
                $dg.datagrid('reload');
            }
        });
    }

    //关闭对话框
    function closeDa(){
        $da.dialog('close',true);
    }
</script>


<div  class="easyui-layout" data-options="fit:true">
    <div data-options="region:'center',">
        <table id="stDg" ></table>


        <div id="stDa"></div>

    </div>
</div>