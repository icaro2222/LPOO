<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>SysSchool</title>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	
	<%
		String usuario = (String) session.getAttribute("usuario");
		if(usuario == null){
			response.sendRedirect("Login.jsp");
		}	
	%>
	
	<nav class="bananaNav">
	<div class="menu">
		<ul>
			<li><a href="Cadastrar.jsp">Fazer cadastros</a></li>
			<li><a href="Consultar.jsp">Fazer consultas</a></li>
			<li><img href="Welcome.jsp" src="img/2.png"height="30px"></li>
			<li><a href="Dashboard.jsp">Dashboard</a></li>
			<li><a href="Deslogar.jsp">Log out</a></li>
		</ul>
	</div>
	</nav>
	<main class="bananaMain">
		<form action="" method="post" class="bananaForm">
			<div>
			<img src="img/2.png" height="300px">
			</div>
		</form>
	</main>
</body>
</html>