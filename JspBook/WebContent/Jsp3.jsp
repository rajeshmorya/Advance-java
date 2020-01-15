<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import= "com.aartek.A" %>
<%! A a = new A(); %>
<% 
a.setl(10); 
a.setName("abc"); 
int i = a.getl();
String name = a.getName();
%>
value of i is <%= i %>
value of name is:<%= name %>
</body>
</html>