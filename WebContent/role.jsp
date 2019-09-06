<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.ArrayList,com.classmarker.actions.Role" %>
    <%@taglib prefix="s" uri="/struts-tags" %>
   
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
	<h1 class='text-center btn btn-outline-success w-100 display-1'>Add Role</h1>
<s:form action="addrole" method="post" namespace="/">
	<s:textfield type="text" name="rolename" cssClass="form-group form-control" label="Role Name" placeholder="Enter Role Name"/>
	<s:textfield type="text" name="roledesc" cssClass="form-group form-control" label="Role Description" placeholder="Enter Role Description"/>
	<s:checkboxlist list="rightlist" name="selectedright" label="Rights" />
	<s:submit value="SUbmit" name="submit"/>
	<%-- cssClass="form-group btn btn-primary mx-5" --%>
</s:form> 


<s:form name="showrole" action="showrole">
                <%-- <s:textfield name="username" /> --%>
                <s:submit value="Fetch Records"/>
</s:form>

<table>
	<thead>
		<tr>
			<th>Role Name</th>
			<th>Role Description</th>
			<th>Rights</th>
		</tr>
	</thead>
	<s:iterator value="rolelist">
	<tr>
			<td><s:property value="rolename"/></td>
			<td><s:property value="roledesc"/></td>
			<td><s:property value="showrights"/></td>
	<tr>
	</s:iterator>
</table>
</div>
</body>
</html>