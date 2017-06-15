<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/back/easyui/css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/back/easyui/css/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/back/easyui/css/IconExtension.css">
    <script src="${pageContext.request.contextPath}/back/easyui/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/back/easyui/js/jquery.easyui.min.js"></script>
    <script src="${pageContext.request.contextPath}/back/easyui/js/form.validator.rules.js"></script>
    <script src="${pageContext.request.contextPath}/back/easyui/js/easyui-lang-zh_CN.js"></script>
    <script src="${pageContext.request.contextPath}/back/editor/kindeditor-common.js"></script>
    <script src="${pageContext.request.contextPath}/back/editor/kindeditor.js"></script>
    <script src="${pageContext.request.contextPath}/back/editor/lang/zh_CN.js"></script>
    <script>
        $(function () {
            //富文本编辑器
            KindEditor.ready(function(K) {
                editor = K.create("#editor", {
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
            });
        })
    </script>
</head>
<body >
<form >
    <textarea id="editor" name="product.description" class="editor"
    style="width: 100%; display: none;"></textarea>
</form>
</body>
</html>
