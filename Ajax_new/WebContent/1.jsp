<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function fn()
{
	var x=document.getElementById("t1").value;
	var y=document.getElementById("t2").value;
	var ht=new XMLHttpRequest();
	ht.onreadystatechange=function()
	{
		if(ht.readyState == 4)
			{
				alert(ht.responseText);
			}
		
	}
	ht.open("get","2.jsp?firstname="+x+"&lastname="+y,true);
	ht.send();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
firstname<input type="text" name="firstname" id="t1"><br>
lastname<input type="text" name="lastname" id="t2"><br> 
<input type="button" value="add" onclick="fn()">
</body>
</html>