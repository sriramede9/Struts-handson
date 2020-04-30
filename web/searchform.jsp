<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search tutorial</title>
</head>
<body>

<!-- <form action="tutorials/getTutorials.action" method="post">
<label for="language">Search by language</label>
<input type="text" id="language" name="language">
<input type="submit" value="search">
</form> -->


<s:form action="tutorials/getTutorials">  
<s:textfield key="language" label="language"></s:textfield>  
<s:submit value="search"></s:submit>  
</s:form>

</body>
</html>