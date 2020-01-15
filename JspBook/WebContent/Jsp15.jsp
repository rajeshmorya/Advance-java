<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p1" class="com.aartek.Person" scope="request">
<% p1.setAge(20); %>
<% p1.setEmail("a@A.com"); %>
<% p1.setFirstName("rahul"); %>
<% p1.setWeight(45.89); %>

<%= p1.getAge() %>
<%= p1.getEmail() %>
<%= p1.getFirstName() %>
<%= p1.getWeight() %>
</jsp:useBean>
</body>
</html>