<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p1" class="com.aartek.Person" scope="session">
FirstName:<jsp:getProperty property="firstName" name="p1"/><br>
Email:<jsp:getProperty property="email" name="p1"/><br>
Age:<jsp:getProperty property="age" name="p1"/><br>
Weight:<jsp:getProperty property="weight" name="p1"/><br>

<jsp:setProperty property="firstName" name="p1" value="abc"/>
<jsp:setProperty property="age" name="p1" value="25"/>
<jsp:setProperty property="email" name="p1" value="a@a.com"/>
<jsp:setProperty property="weight" name="p1" value="56.32"/>
<hr>
FirstName:<jsp:getProperty property="firstName" name="p1"/><br>
Email:<jsp:getProperty property="email" name="p1"/><br>
Age:<jsp:getProperty property="age" name="p1"/><br>
Weight:<jsp:getProperty property="weight" name="p1"/>
</jsp:useBean>
</body>
</html>