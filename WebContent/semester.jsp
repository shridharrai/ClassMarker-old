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
	<h1 class='text-center btn btn-outline-success w-100 display-1'>Add Semester</h1>
<s:form action="addsem" method="post">
	<s:textfield type="text" name="semestername" cssClass="form-group form-control" label="Semester Name" placeholder="Enter Semester Name"/>
	<s:textfield type="text" name="semesterdesc" cssClass="form-group form-control" label="Semester Description" placeholder="Enter Semester Description"/>
	<s:submit cssClass="form-group btn btn-primary mx-5"/>
</s:form>

<s:form name="showsemester" action="showsemester">
                <%-- <s:textfield name="username" /> --%>
                <s:submit value="Fetch Records"/>
</s:form>

<table>
	<thead>
		<tr>
			<th>Branch Name</th>
			<th>Branch Description</th>
		</tr>
	</thead>
	<s:iterator value="semesterlist">
	<tr>
			<td><s:property value="semestername"/></td>
			<td><s:property value="semesterdesc"/></td>
	<tr>
	</s:iterator>
</table>
</div>
</body>
</html>