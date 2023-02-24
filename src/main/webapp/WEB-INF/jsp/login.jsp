<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
    <title>Login</title>
    </head>
     <body>
<%
    String login = (String) request.getAttribute("login");
%>
<h3>
<%= ("Hello " + login + " !")%>
    <br>
    <p style="color:#DC143C">
    Сurrent date and time:</p>
<%Date date = new Date();%>
<%= date%>
    <p style="color:#0000ff">
Сlick to see the list of devices:</p></h3>
     <form action=devices>
     <button>Device Home</button>
     </form>
     </body>
</html>
