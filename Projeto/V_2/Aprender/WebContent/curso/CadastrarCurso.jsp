
<%@page import="br.servlets.curso.consultarCursoController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>SysSchool</title>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../css/styles.css">
</head>
<body>
	<nav class="bananaNav">
		<div class="menu">
			<ul>
				<li><img src="../img/2.png" height="30px"></li>
			<div class="me"> 
			<li><a class="meua" href="../Welcome.jsp">SysSchool</a></li>
			</div>
				<li><a href="../Cadastrar.jsp">Voltar</a></li>
				<li><a href="../Consultar.jsp">Fazer uma consulta</a></li>
			</ul>
		</div>
	</nav>
	<main class="bananaMain">
		<form action="../CadastrarCurso" method="post" class="bananaForm">
			<div>
				<label><strong>Nome do curso:</strong></label><input type="text"
					name="nomecurso">
			</div>
			<div>
				<label><strong>Valor do curso:</strong></label><input type="number"
					name="valor">
			</div>
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Cadastrar Curso">
			</div>
		</form>
	</main>
</body>
</html>