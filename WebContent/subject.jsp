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
<s:form action="addsubject" namespace="/">
	<s:textfield type="text" name="subjectcode" cssClass="form-group form-control" label="Subject Code" placeholder="Enter Subject Code"/>
	<s:textfield type="text" name="subjectid" cssClass="form-group form-control" label="Subject Id" placeholder="Enter Subject Id"/>
	<s:textfield type="text" name="subjectname" cssClass="form-group form-control" label="Subject Name" placeholder="Enter Subject Name"/>
	<s:textfield type="text" name="subjectdesc" cssClass="form-group form-control" label="Subject Description" placeholder="Enter Subject Description"/>
	<s:combobox list="branchlist" headerKey="-1" headerValue="--- Select ---" name="selectedbranch" label="Branch"/>
	<s:combobox list="semesterlist" headerKey="-1" headerValue="--- Select ---" name="selectedsemester" label="Semester"/>
	<%-- <s:combobox list="semesterlist"><s:property value="semestername"/></s:combobox> --%>
	<s:submit value="submit" cssClass="form-group btn btn-primary mx-5"/>
</s:form>

<s:form name="showsubject" action="showsubject">
                <%-- <s:textfield name="username" /> --%>
                <s:submit value="Fetch Records"/>
</s:form>

<table>
	<thead>
		<tr>
			<th>Subject Code</th>
			<th>Subject Id</th>
			<th>Subject Name</th>
			<th>SUbject Description</th>
			<th>Branch Name</th>
			<th>Semester Name</th>
		</tr>
	</thead>
	<s:iterator value="subjectlist">
	<tr>
			<td><s:property value="subjectcode"/></td>
			<td><s:property value="subjectid"/></td>
			<td><s:property value="subjectname"/></td>
			<td><s:property value="subjectdesc"/></td>
			<td><s:property value="selectedbranch"/></td>
			<td><s:property value="selectedsemester"/></td>
	<tr>
	</s:iterator>
</table>
</div>
</body>
</html>