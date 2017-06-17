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
        <div style="margin-top: 10px;">
            类型：<input name="type" class="easyui-textbox" data-options="required:true"/>
        </div>
        <div style="margin-top: 10px;" style="width: 300px;height: 200px">
            编辑框：<textarea id="editor"  name="txt" class="editor"
                      style="width: 100%; "></textarea>
        </div>
        <%--<div style="margin-top: 10px;">
            发表日期：<input name="date" class="easyui-textbox" data-options="required:true"/>
        </div>--%>

       <%-- <div style="margin-top: 10px;">
            内容：<textarea name="txt"/>
            &lt;%&ndash;<input name="txt" class="easyui-textbox" data-options="required:true"/>&ndash;%&gt;
        </div>--%>
    </form>
</div>
<script>
    $(function () {
        //富文本编辑器
            editor = KindEditor.create("#editor", {
                themeType:"simple",//修改主题
                height: "600px",
                items: [
                    "source",  "preview","fullscreen","clearhtml","|",
                    "undo", "redo","|",
                    "copy", "paste","plainpaste", "wordpaste", "|",
                    "justifycenter", "justifyright",
                    "justifyfull", "insertorderedlist", "insertunorderedlist", "indent", "outdent",  "|",
                    "formatblock", "fontname", "fontsize",
                    "forecolor", "hilitecolor", "bold",
                    "italic", "underline", "strikethrough", "lineheight", "removeformat", "|", "image","table", "hr", "emoticons", "baidumap", "pagebreak",
                    "anchor", "link", "unlink"
                ],
                langType: 'zh_CN',
                syncType: "form",
                filterMode: false,
                pagebreakHtml: '<hr class="pageBreak" \/>',
                allowFileManager: true,
                filePostName: "image",
                fileManagerJson:"${pageContext.request.contextPath }/imgs/browser",
                uploadJson: "${pageContext.request.contextPath }/imgs/uploadImg",
                extraFileUploadParams: {
                    token: getCookie("token")
                },
                afterChange: function() {
                    this.sync();
                }
            });
    })
</script>