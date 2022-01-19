
<%@page import="java.util.List"%>
<%@page import="Model.Curso"%>
<%@page import="br.servlets.curso.consultarCursoController"%>
<%@page import="java.util.List.*" %>
<%@page import="java.util.ArrayList" %>
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
				<li><a href="../ApagarAluno.jsp">Apagar</a></li>
				<li><a href="../Consultar.jsp">Fazer uma consulta</a></li>
			</ul>
		</div>
	</nav>
	<main class="bananaMain">
		<form action="../ConsultarCurso" method="post" class="consultarcurso">
			<div>
				<label><strong>Nome :</strong></label><input type="text"
					name="nomecurso">
			</div>
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Consultar Curso">
			</div>
		</form>
		<form action="../ConsultarCurso" method="post">
			<div>
			<%
			if(request.getAttribute("cursos") != null){
				List<?> cursos = (List<?>) request.getAttribute("cursos");
				for(int c=0; c<(cursos.size()) && c<3; c++){
					Curso curso = (Curso) cursos.get(c);
			%>
			<div>
				<div class="fo">
					<span><%out.print("Nome: " + curso.getNomecurso()); %></span>
					<span><%out.print("Valor: " + curso.getValor()); %></span>
					<input id="bananaButton" type="submit" name="salvar"
						value="Alterar">
					<input id="bananaButton" type="submit" name="salvar"
						value="Apagar">
				</div>
			</div>
			<%
			}
			}
			%>
			</div>
		</form>
	</main>
</body>
</html>