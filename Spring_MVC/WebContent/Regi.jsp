<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="insert.do" modelAttribute="regis" method="get">
			<f:hidden path="id"/>
			fn<f:input path="fn"/>
		<br>
			ln<f:input path="ln"/>
		<br>
			un<f:input path="un"/>
		<br>
			pass<f:input path="pass"/>
		<br>
			<input type="submit" value="save">
	</f:form>
	<a href="Search.do">Search_data</a><br>
</body>
</html>