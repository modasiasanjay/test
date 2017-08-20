<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Edit Page.....
<f:form action="Update.do" method="get">
<c_rt:forEach var="row" items="${data}">
  <tr>
			<td><input type="hidden" name="id" value="${row.id}"><br>
				</td>
				<td><input type="text" name="fn" value="${row.fn}"><br>
				</td>
				<td><input type="text" name="ln" value="${row.ln}"> <br>
				</td>
				<td><input type="text" name="un" value="${row.un}"><br>
				</td>
				<td><input type="text" name="pass" value="${row.pass}"><br>
				</td>
			
			<td><input type="submit" value="save"><br></td>
			</tr>
	</c_rt:forEach>
</f:form>
</body>
</html>