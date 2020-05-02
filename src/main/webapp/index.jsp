<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<a href="${pageContext.request.contextPath}/controller/emp/list?empno=7788">listEmp</a>
<a href="${pageContext.request.contextPath}/controller/emp/fun?date=1999-9-21">
    利用全局类型转换器，将客户端传递过来的日期形式的字符串转换为Date类型
</a>
</body>
</html>
