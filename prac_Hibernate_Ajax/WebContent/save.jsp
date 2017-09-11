<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String s=request.getParameter("pqr");
String s1=request.getParameter("xyz");
String s2=request.getParameter("abc");
String s3=request.getParameter("qaz");

session.setAttribute("pqr", s);
session.setAttribute("xyz", s1);
session.setAttribute("abc", s2);
session.setAttribute("qaz", s3);

response.sendRedirect("login1.jsp");
%>
</body>
</html>