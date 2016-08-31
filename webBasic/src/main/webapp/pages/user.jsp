<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: sniper
  Date: 16-8-26
  Time: 下午1:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:iterator value="userList">
   ddd <s:property value="userName"/>
</s:iterator>
<h1>USER PAGE!!!</h1>
<s:property value="%{userName}"></s:property>
<s:property value="userName"></s:property>
<s:property value="#request.userName"></s:property>
<s:property value="%{#attr.userName}"></s:property>
</body>
</html>
