<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Dashboard</h1>
<h1>welcome <s:property value="userid"/></h1>
<s:form name="showsemesterbranch" action="showsemesterbranch">
                <%-- <s:textfield name="username" /> --%>
                <s:submit value="Fetch Records"/>
</s:form>
<a href="showsemesterbranch.action">subject</a>
<a href="showright.action">role</a>
<a href="showbranchsemester.action">register student</a>
<a href="showbranchsemestersubject.action">register teacher</a>
<a href="showgroupstudent.action">group</a>
<a href="pretestcache.action">add test</a>
<a href="semester.jsp">semester</a>
<a href="branch.jsp">branch</a>
</body>
</html>