<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! public int sqr(int i)
{
	return i*i;
} %>
<h1>
<% out.println(sqr(20)); %>
<% out.println(sqr(30)); %>
<% out.println(sqr(40)); %>
<% out.println(sqr(50)); %>
<% out.println(sqr(60)); %>
<% out.println(sqr(70)); %>
</h1>
</body>
</html>