<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="f"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<f:form action="update.do" method="get">
			<c:forEach var="row" items="${data}">
 				 <tr>
					<td><input type="hidden" name="id" value="${row.id}"></td>
					<td><input type="text" name="firstName" value="${row.firstName}"></td>
					<td><input type="text" name="lastName" value="${row.lastName}"></td>
					<td><input type="submit" value="save"><br></td>
				</tr>
			</c:forEach>
		</f:form>
</body>
</html>