<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import ="com.aartek.Person" %>
11111
<% Person p2=(Person)session.getAttribute("p1"); %>
<%= p2 %>
FirstName:<jsp:getProperty property="firstName" name="p2"/><br>
Email<jsp:getProperty property="email" name="p2"/><br>
Age:<jsp:getProperty property="age" name="p2"/><br>
Weight<jsp:getProperty property="weight" name="p2"/>
</body>
</html>