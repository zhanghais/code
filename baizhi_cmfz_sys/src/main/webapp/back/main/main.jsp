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
        var $aa,$tt;
        $(function(){
            $aa = $("#me");
            $tt = $("#tt");
            //初始化系统菜单
            $.post("/baizhi_cmfz_sys/menu/queryAll",function(menus){

                $.each(menus,function(i,menu){
                    console.log("i, menu")
                    var content = "<div style='text-align: center;'>";
                    $.each(menu.menus,function(j,child){
                        content +="<div onclick=\"addTabs('"+child.name+"','"+child.icon+"','"+child.href+"')\" class='easyui-linkbutton' data-options=\"plain:true,iconCls:'"+child.icon+"'\" style='border:1px solid green; width:90%;margin: 5 0 5 0 ;'>"+child.name+"</div>";
                    })
                    content +="</div>";

                    $aa.accordion('add',{
                        title:menu.name,
                        iconCls:menu.icon,
                        content:content,
                    });
                });

            },"JSON");
        })

        //添加选项卡
        function  addTabs(title,icon,href){
            if(!$tt.tabs('exists',title)){
                $tt.tabs('add',{
                    title:title,
                    iconCls:icon,
                    href:"${pageContext.request.contextPath}/"+href,
                    closable:true,
                });
            }else{
                $tt.tabs('select',title)
            }
        }
    </script>
</head>
<body class="easyui-layout">

<div data-options="region:'north',split:false" style="height:70px;">
    <h1 align="center">持明法洲</h1>
</div>

<div data-options="region:'south',split:false" style="height:40px;"></div>


<div data-options="region:'west',title:'系统菜单',split:false" style="width:200px;">

    <div id="me" class="easyui-accordion" data-options="fit:true">

    </div>
</div>

<div data-options="region:'center',iconCls:'icon-house'">

    <div id="tt" class="easyui-tabs" data-options="fit:true"></div>

</div>
</body>
</html>
