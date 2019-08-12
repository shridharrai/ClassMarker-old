<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel ="stylesheet">
</head>
<body>
<div class="container-fluid">
<h1 class="text-center">Class Marker</h1>
<s:form action="firstlogin" method="post">
<s:textfield name="userid" cssClass="form-group form-control" type="text" label="Enter Your Name"/>
<s:password name="password" cssClass="form-group form-control" type="password" label="Enter Your Password"/>
<s:submit cssClass="btn btn-primary"/>
</s:form>
</div>
</body>
</html>