<%@ page import="com.academy_it.service.DeviceService" %>
<%@ page import="com.academy_it.model.entity.Device" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Devices Home</title>
</head>
<body>

<%
    DeviceService deviceService = new DeviceService();
    List <Device> deviceList = deviceService.getDevice();
%>
<%
    for (Device device: deviceList) {
        out.println("Device -" + device.getTypeOfDevice() + " - " + device.getPowerOfDevice() + " Wt");
%>
<br>
<%
    }
%>
</body>
</html>
