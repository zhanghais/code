<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
    <script>
    var $dgb,$dab;
    $(function () {
        $dgb = $("#ag");
        $dab = $("#aa");
        $dgb.datagrid({
            url:'${pageContext.request.contextPath}/chapter/queryByWenId?id='+'${param.id}',
            width:'100%',
            height:'100%',
            columns: [[
                {title: "编号", field: "id",width:100, align: 'center'},
                {title: "相对路径", field:"download",width: 100,  align:'center'},
                {title: "大小（字节）", field: "size",width: 100, align:'center'},
                {title: "标题", field: "title",width:100, align:'center'},
            ]],
            pagination:true,
            pageNumber:2,
            pageSize:2,
            pageList:[2,4,6,8,10],
        });
    });
</script>
<div  class="easyui-layout" data-options="fit:true">
    <div data-options="region:'center',">
        <table id="ag"></table>

        <div id="aa"></div>
    </div>

</div>