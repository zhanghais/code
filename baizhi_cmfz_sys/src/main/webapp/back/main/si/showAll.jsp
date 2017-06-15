<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<script>
    var $dg,$da;
    $(function () {
        $dg = $("#sidDg");
        $da = $("#sidDa");
        $dg.datagrid({
            url: '${pageContext.request.contextPath}/si/queryAll',
            //fit:true,
            width:'100%',
            height:'100%',
            columns: [[
                {title: "编号", field: "id",width:100, align: 'center'},
                {title: "标题", field: "title",width:100,  align: 'center'},
                {title: "上师姓名", field: "name",width:100, align: 'center'},
                {title: "发布日期", field: "date",width:100, align: 'center'},
                {title: "类型", field: "type",width:100, align: 'center'},
                {
                    title: "封面图片", field: "wen", width: 60, align: 'center',
                    formatter: function (value, row, index) {
                        return '<img style="width:50px; height:40px" src=\"${pageContext.request.contextPath}/'+row.path+'\"/>';
                    }
                },
                {
                    title: "操作", field: "options", width: 160, align: 'center',
                    formatter: function (value, row, index) {
                        return "<a class='del' onClick=\"del('" + row.id + "')\" href='javascript:;'>删除</a>&nbsp;&nbsp;" +
                                "<a class='query' onClick=\"query('" + row.id + "')\" href='javascript:;'>查看文章</a>";
                    }
                }
            ]],
            onLoadSuccess: function (data) {
                $(".del").linkbutton({
                    plain: true,
                    iconCls: 'icon-remove',

                });
                $(".query").linkbutton({
                    plain: true,
                    iconCls: 'icon-help',
                });
            },
            pagination:true,
            pageNumber:2,
            pageSize:2,
            pageList:[2,4,6,8,10],
            toolbar:'#si',


        });
    });

    //删除的操作
    function del(id){
        $.messager.confirm("提示","您确定要删除吗?",function(r){
            if(r){
                //发送异步请求删除数据
                $.post("${pageContext.request.contextPath}/si/delete",{"id":id});
                $dg.datagrid('reload');
            }
        });
    }
    //修改的操作
    function query(id){
        $da.dialog({
            width:600,
            height:300,
            title:"文章详细信息",
            href:'${pageContext.request.contextPath}/back/main/si/html/show.jsp?id='+id,
        });

    }
    function add() {
        $da.dialog({
            width:600,
            height:300,
            title:"添加文章",
            iconCls:"icon-man",
            href:'${pageContext.request.contextPath}/back/main/si/add.jsp',
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
        $("#aForm").form('submit',{
            url:'${pageContext.request.contextPath}/si/save',
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

    <div data-options="region:'center',">
        <table id="sidDg" ></table>


        <div id="sidDa"></div>
    </div>
    <div id="si">
        <a href="#" onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">添加</a>
    </div>
</div>