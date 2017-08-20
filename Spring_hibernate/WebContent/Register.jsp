<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="f"%>   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
			<f:form action="insert.do" modelAttribute="r" method="get">
	FirstName<f:input path="FirstName"/><br>
	LastName<f:input path="LastName"/><br>
	UserName<f:input path="UserName"/><br>
		Pass<f:input path="Pass"/><br>
	
		<input type="submit" value="save">
		<a href="search.do">search</a>
</f:form>
</body>
</html>