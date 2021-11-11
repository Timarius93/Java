<!DOCTYPE html>
<%@page import="model.Bicicletta"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1 {
	color: red;
}
</style>
</head>
<body>

	<%//scriptlet
	String s = "ciao java";
	String ss = "helleeee";
	for (int i = 1; i < 7; i++) {
		out.print("<h" + i + ">");
		out.print(s);
		out.print("<h" + i + ">");
	}
	
	Bicicletta b = new Bicicletta();
	
	%>

	<h1><%=ss%></h1>
	<h1><%=b.colore%></h1>

	<script>
		console.log('funge')
	</script>

</body>
</html>