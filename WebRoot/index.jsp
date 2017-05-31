<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>HOME</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is the WebSite HomePage">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <h1>This is my homeIndex</h1>
     
    <s:form action="login">
	<s:textfield name="username" label="用户名"/>
	<s:textfield name="password" label="密码"/>
	<tr align="center">
		<td colspan="2">
		<s:submit value="提交" theme="simple"/>
		<s:reset value="重置" theme="simple"/>
		</td>
	</tr>
</s:form>
  </body>
</html>
