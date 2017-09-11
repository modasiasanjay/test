<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript">
	function fn() {

		var x = document.form1.CountryName.value;
		//alert(x); 
		var ht = new XMLHttpRequest();
		
		ht.onreadystatechange = function() {
			
			document.form1.sn.options.remove(crt);
			if (ht.readyState == 4) {
				
			//	alert(ht.responseText)
				
				var jsn = JSON.parse(ht.responseText);
				
				for (var i = 0; i < jsn.length; i++) {
					var crt = document.createElement("option");
					crt.value = jsn[i].stateid;
					crt.text = jsn[i].sn;
				
					document.form1.sn.options.add(crt);
				}
			}

		}

		ht.open("post", "loadStateController?cid="+x, true);
		ht.send();
	}

</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CityController"  method="post" name="form1">

		CountryName<select name="CountryName" onchange="fn()">
			<c_rt:forEach items="${sessionScope.data}" var="b">
				<option value="${b.cid}">${b.countryName}</option>
			</c_rt:forEach>
		</select><br> StateName<select name="sn">
		</select><br> CityName<input type="text" name="CityName"><br>
		CityDescription<input type="text" name="CityDescription"><br>
		<input type="submit" value="save">

	</form>
</body>
</html>