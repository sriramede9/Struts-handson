<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body style="background-color: teal">
	<s:form action="/login">
		<s:textfield key="username" label="userid"></s:textfield>
		<s:password key="password" label="password"></s:password>
		<s:submit value="login"></s:submit>
	</s:form>

</body>
</html>