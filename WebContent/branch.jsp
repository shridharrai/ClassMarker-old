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
	<h1 class='text-center btn btn-outline-success w-100 display-1'>Add Branch</h1>
<s:form action="addbranch" method="post">
	<s:textfield type="text" name="branchname" cssClass="form-group form-control" label="Branch Name" placeholder="Enter Branch Name"/>
	<s:textfield type="text" name="branchdesc" cssClass="form-group form-control" label="Branch Description" placeholder="Enter Branch Description"/>
	<s:submit cssClass="form-group btn btn-primary mx-5"/>
</s:form>
</div>
</body>
</html>