<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function fn()
{
	var x=document.form1.co.value;
	var ht=new XMLHttpRequest();
	ht.onreadystatechange=function()
	{
		if(ht.readyState == 4)
			{
				alert(ht.responseText)
				var jsn=JSON.parse(ht.responseText);
				for(var i=0;i<jsn.length;i++)
					{
						var crt=document.createElement("option");
						crt.value=jsn[i].stateid;
						crt.text=jsn[i].statename;
						document.form1.st.options.add(crt);
					}
			
			}
	
	}

	ht.open("get","state2.jsp",true);
	ht.send();


}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="form1">
Country:<select name="co" onchange="fn()">
		<option>select</option>
		<option>abc</option>
		<option>xyz</option>
		</select><br>
State:<select name="st">
	  </select>
</form>

</body>
</html>