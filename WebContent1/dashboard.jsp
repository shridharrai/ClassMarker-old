<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<h1>Dashboard</h1>
<h2>Welcome <s:property value="userid"/></h2>
<s:form name="showsemesterbranch" action="showsemesterbranch">
 <s:submit value="Fetch Records"/>
</s:form>
</body>
</html>