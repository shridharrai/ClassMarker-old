<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h1>Struts 2 multiple check boxes example</h1>

<s:form action="resultAction" namespace="/">

<h2>
	<s:checkboxlist label="What's your favor color" list="colors" 
	   name="yourColor" value="defaultColor" />
</h2> 

<s:submit value="submit" name="submit" />
	
</s:form>

</body>
</html>
Copy