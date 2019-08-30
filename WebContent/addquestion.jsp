<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	<h1 class='text-center btn btn-outline-success w-100 display-1'>Add Questions</h1>
<s:form action="addquestion" namespace="/">
	<s:iterator begin="1" end="2">
		<s:textfield type="text" name="ques" cssClass="form-group form-control" label="Question" placeholder="Enter Question"/>
		<s:textfield type="text" name="choice1" cssClass="form-group form-control" label="Choice 1" placeholder="Enter first choice"/>
		<s:textfield type="text" name="choice2" cssClass="form-group form-control" label="Choice 2" placeholder="Enter second choice"/>
		<s:textfield type="text" name="choice3" cssClass="form-group form-control" label="Choice 3" placeholder="Enter third choice"/>
		<s:textfield type="text" name="choice4" cssClass="form-group form-control" label="Choice 4" placeholder="Enter fourth choice"/>
		<s:combobox list="{1,2,3,4}" headerKey="-1" headerValue="--- Select ---" name="correctchoice" label="Correct Choice"/>
	 </s:iterator>
	<s:submit value="submit" cssClass="form-group btn btn-primary mx-5"/>
</s:form>

</div>
</body>
</html>