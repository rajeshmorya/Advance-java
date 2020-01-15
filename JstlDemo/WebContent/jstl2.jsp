<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.ArrayList" %>
<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<% ArrayList list = new ArrayList(); 
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
request.setAttribute("list", list);
%>
<j:forEach items="${list}" var="list">
<j:out value="${list}"/><br>
</j:forEach>
</body>
</html>