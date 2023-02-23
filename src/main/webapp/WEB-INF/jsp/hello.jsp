<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/ftm" %>--%>
<html>
<head>
    <title>Hello</title>
</head>
<body>
Hello Webapp Device!
<br>
Entry date:
<br>
<% Date date = new Date();%>
<%=date%>
<br>
</body>
</html>
