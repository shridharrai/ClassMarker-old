<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    <%@page import="java.util.ArrayList,com.classmarker.actions.Branch,com.classmarker.actions.FetchBranch" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel ="stylesheet">
<%-- <style>
.hide{
display:none;
}
</style>
<script>
function showBranch(){
	document.getElementById("branchshow").classList.toggle('hide');
}
</script> --%>
</head>
<body>
<div class='w-100 float-right pr-2'>
	<h1 class='text-center btn btn-outline-success w-100 display-1'>Add Branch</h1>
<s:form action="addbranch" method="post">
	<s:textfield type="text" name="branchname" cssClass="form-group form-control" label="Branch Name" placeholder="Enter Branch Name"/>
	<s:textfield type="text" name="branchdesc" cssClass="form-group form-control" label="Branch Description" placeholder="Enter Branch Description"/>
	<s:submit cssClass="form-group btn btn-primary mx-5"/>
</s:form> 

<s:form name="showbranch" action="showbranch">
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
	<s:iterator value="branchlist">
	<tr>
			<td><s:property value="branchname"/></td>
			<td><s:property value="branchdesc"/></td>
	<tr>
	</s:iterator>
</table>
</div>
</body>
</html>