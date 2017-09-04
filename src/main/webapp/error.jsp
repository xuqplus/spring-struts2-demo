<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/1
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
error.jsp<br>
<s:property value="map"></s:property><br>
user: <s:property value="user"></s:property><br>
user.id: <s:property value="user.id"></s:property><br>
user.name: <s:property value="user.name"></s:property><br>
user.pwd: <s:property value="user.pwd"></s:property><br>
<hr>

<s:iterator value="map">
    <s:property value="#id"></s:property>
    <s:property value="id"></s:property>
    <s:property value="name"></s:property>
    <s:property value="pwd"></s:property>
</s:iterator>
</body>
</html>
