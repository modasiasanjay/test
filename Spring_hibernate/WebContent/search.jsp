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
<table border="1px">
<tr>
<th>Id</th>
<th>FirstName</th>
<th>LastName</th>
<th>Action</th>
</tr>
<c_rt:forEach items="${list}" var="d">
	<tr> <td>${d.id}</td>
	<td>${d.firstName}</td>
	<td>${d.lastName}</td>
	<td><a href="edit.do?id=${d.id}">Edit</a></td></tr>
</c_rt:forEach>
</table>  
</body>
</html>