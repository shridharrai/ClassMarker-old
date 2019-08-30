<%@page import="java.util.ArrayList"%>
<%@page import="com.shubham.actions.Branch,com.shubham.actions.FetchSubject,java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel ="stylesheet">
</head>
<body>
<div class='w-100 float-right pr-2'>
	<h1 class='text-center btn btn-outline-success w-100 display-1'>View Test</h1>

<s:form name="showtest" action="showtest">
                <%-- <s:textfield name="username" /> --%>
                <s:submit value="Fetch Records"/>
</s:form>

<table>
	<thead>
		<tr>
			<th>Test Name</th>
			<th>Marks per Question</th>
			<th> </th>
			<th>Branch Name</th>
			<th>Semester Name</th>
			<th>Subject Name</th>
			<th>Group Names</th>
			<th> </th>
		</tr>
	</thead>
	<s:iterator value="testlist">
	<tr>
			<td><s:property value="testname"/></td>
			<td><s:property value="marksperquestion"/></td>
			<td><button clas="btn btn-primary">View Questions</button></td>
			<td><s:property value="selectedbranch"/></td>
			<td><s:property value="selectedsemester"/></td>
			<td><s:property value="selectedsubject"/></td>
			<td><s:property value="selectedgroup"/></td>
			<td><button clas="btn btn-success">View Result</button></td>
	<tr>
	</s:iterator>
</table>
</div>
</body>
</html>