<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel ="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
</head>
<body>
	                    <h2 class="form-title">Registration</h2>
                        <s:form action="registerteacher" namespace="/">
                        <s:textfield type="text" name="userenrollment" label="Enrollment" placeholder="Enter Enroll"/>
                        <s:textfield type="text" name="userid" label="NAme" placeholder="Enter Name"/>
                        <s:textfield type="text" name="contact" label="contact" placeholder="Enter contact"/>
                        <s:textfield type="text" name="email" label="Email" placeholder="Enter email"/>
                         <s:textfield type="text" name="pwd" label="password" placeholder="Enter pwd"/>
                            <s:checkboxlist list="branchlist" name="selectedbranch" label="branch"/>
                            <s:checkboxlist list="semesterlist" name="selectedsemester" label="semester"/>
                            <s:checkboxlist list="subjectlist" name="selectedsubject" label="subject"/>
                            <s:submit value="submit"/>
                        </s:form>
                                 
</body>
</html>