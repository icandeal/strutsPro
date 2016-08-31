<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html;charset=UTF-8"%>
<%--<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>--%>
<html>
<body>
<h2>Hello World!</h2>
<s:form method="POST" action="user/user_execute.action">
    用户id：<input type="text" name="userId" value="61037"/>
    <s:submit value="提交"/>
</s:form>
</body>
</html>
