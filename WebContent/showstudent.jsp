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
	<h1 class='text-center btn btn-outline-success w-100 display-1'>Add Subject</h1>

<s:form name="showstudent" action="showstudent">
                <%-- <s:textfield name="username" /> --%>
                <s:submit value="Fetch Records"/>
</s:form>

<table>
	<thead>
		<tr>
			<th>Student Enrollment No.</th>
			<th>Student Name</th>
			<th>Student Contact No.</th>
			<th>Student Email Id</th>
			<!-- <th>Student's Branch</th>
			<th>Student's Semester</th> -->
			<!-- <th>Student's Percentage</th> -->
		</tr>
	</thead>
	<s:iterator value="studentlist">
	<tr>
			<td><s:property value="studentenrollment"/></td>
			<td><s:property value="studentname"/></td>
			<td><s:property value="studentcontact"/></td>
			<td><s:property value="studentemail"/></td>
			<%-- <td><s:property value="studentbranch"/></td>
			<td><s:property value="studentsemester"/></td> --%>
	<tr>
	</s:iterator>
</table>
</div>
</body>
</html>