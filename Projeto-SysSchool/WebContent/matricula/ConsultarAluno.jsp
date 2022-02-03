<%@page import="java.util.List"%>
<%@page import="Model.Aluno"%>
<%@page import="br.servlets.consultarAlunoController"%>
<%@page import="java.util.List.*" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>SysSchool</title>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../css/styles3.css">
</head>
<body>
	<%
		String usuario = (String) session.getAttribute("usuario");
		if(usuario == null){
			response.sendRedirect("../Login.jsp");
		}	
	%>
	
	<nav class="bananaNav">
		<ul>
			<li><img src="../img/2.png" height="30px"></li>
		<div class="me"> 
		<li><a class="meua" href="../Dashboard.jsp">SysSchool</a></li>
		</div>
			<li><a href="../Cadastrar.jsp">Voltar</a></li>
			<li><a href="../Consultar.jsp">Fazer uma consulta</a></li>
		</ul>
	</nav>
	<main class="bananaMain">
		<form action="../ConsultarAluno" method="post" class="bananaForm">
			<div>
				<label><strong>Nome:</strong></label><input type="text"
					name="nome">
			</div>
			<h2>OU</h2><br>
			<div>
				<label><strong>Número de matrí­cula:</strong></label><input type="text"
					name="numMatricula">
			</div>
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Consultar Aluno">
			</div>
		</form>
		<form action="../ConsultarAluno" method="post">
			<div>
			<%
			if(request.getAttribute("alunos") != null){
				List<?> alunos = (List<?>) request.getAttribute("alunos");
				for(int c=0; c<(alunos.size()) && c<3; c++){
					Aluno aluno = (Aluno) alunos.get(c);
			%>
			<div>
				<div class="fo">
					<span><%out.print("Nome: " + aluno.getNome()); %></span>
					<span><%out.print("Número de Matrícula: " + aluno.getNmatricula()); %></span>
					<span><%out.print("Status: " + aluno.getStatus()); %></span>
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