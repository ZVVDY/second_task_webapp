<%@ page import="com.academy_it.service.LoginService" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    </head>
     <body>
<%
    LoginService loginService = new LoginService();
    String login = (String) request.getAttribute("login");
    String password = (String) request.getAttribute("password");
    if (loginService.checkCredentials(login, password )){
%>
<%= ("Hello " + login + " !")%>
<br>
<%Date date = new Date();%>
<%= date%>
<br>
<form action=devices>
<button>Device Home</button>
</form>
<%
    }
 else {
    %>
<%=("Access denied!")%>
       <%
           }
       %>
</body>
</html>
