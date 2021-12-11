<%@page import="java.util.List"%>
<%@page import="Model.Aluno"%>
<%@page import="br.servlets.consultarAlunoController"%>
<%@page import="java.util.List.*" %>
<%@page import="java.util.ArrayList;" %>
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
	<nav class="bananaNav">
		<div class="menu">
			<ul>
				<li><img src="img/2.png" height="30px"></li>
			<div class="me"> 
			<li><a class="meua" href="Welcome.jsp">SysSchool</a></li>
			</div>
				<li><a href="Cadastrar.jsp">Voltar</a></li>
				<li><a href="Consultar.jsp">Fazer uma consulta</a></li>
			</ul>
		</div>
	</nav>
	<main class="bananaMain">
		<form action="ConsultarAluno" method="post" class="bananaForm">
			<div>
				<label><strong>Nome:</strong></label><input type="text"
					name="nome">
			</div>
			<h2>OU</h2><br>
			<div>
				<label><strong>Número de matrícula:</strong></label><input type="text"
					name="numMatricula">
			</div>
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Consultar Aluno">
			</div>
			
			<div class="bananaForm">
			<%
			if(request.getAttribute("alunos") != null){
				List<?> alunos = (List<?>) request.getAttribute("alunos");
				for(int c=0; c<(alunos.size()) && c<3; c++){
					Aluno aluno = (Aluno) alunos.get(c);
			%>
			<div>
				<div>
					<span style="font-weight: bold">Nome</span>
					<span><%out.print(aluno.getNome()); %></span>
				</div>
				<div>
					<span style="font-weight: bold">NumMatricula</span>
					<span><%out.print(aluno.getNmatricula()); %></span>
				</div>
				<div>
					<span style="font-weight: bold">Status</span>
					<span><%out.print(aluno.getStatus()); %></span>
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