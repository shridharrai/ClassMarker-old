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
<s:form action="addsubject" method="post">
	<s:textfield type="text" name="subjectcode" cssClass="form-group form-control" label="Subject Code" placeholder="Enter Subject Code"/>
	<s:textfield type="text" name="subjectid" cssClass="form-group form-control" label="Subject Id" placeholder="Enter Subject Id"/>
	<s:textfield type="text" name="subjectname" cssClass="form-group form-control" label="Subject Name" placeholder="Enter Subject Name"/>
	<s:textfield type="text" name="subjectdesc" cssClass="form-group form-control" label="Subject Description" placeholder="Enter Subject Description"/>
	<s:submit cssClass="form-group btn btn-primary mx-5"/>
</s:form>
</div>
</body>
</html>