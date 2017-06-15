
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<script>
    $.post("${pageContext.request.contextPath}/si/queryById",{"id":'${param.id}'},function (result) {
        $("#dd").html(result.txt);

    },"JSON");
</script>
<div id="dd"></div>