<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
search data....
<table border="1px">
<c_rt:forEach items="${data}" var="a">
	<tr><td>${a.id}</td>
		<td>${a.fn}</td>
		<td>${a.ln}</td>
		<td>${a.un}</td>
		<td>${a.pass}</td>
		<td><a href="Edit.do?id=${a.id}">Edit</a></td>
		<td><a href="Delete.do?id=${a.id}">Delete</a></td>
	</tr>
</c_rt:forEach>
</table>
</body>
</html>