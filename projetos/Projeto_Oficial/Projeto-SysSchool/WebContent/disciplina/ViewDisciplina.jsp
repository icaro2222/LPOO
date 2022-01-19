
<%@page import="java.util.List"%>
<%@page import="Model.Disciplina"%>
<%@page import="br.servlets.disciplina.consultarDisciplinaController"%>
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
				<li><a href="ApagarDisciplina.jsp">Apagar</a></li>
				<li><a href="Consultar.jsp">Fazer uma consulta</a></li>
			</ul>
		</div>
	</nav>
	<main class="bananaMain">
		<form action="ConsultarDisciplina" method="post" class="consultarcurso">
			<div class="buscarnome">
				<label><strong>Nome :</strong></label><input type="text"
					name="nomedisciplina">
			</div>
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Consultar disciplina">
			</div>
		</form>
		<form action="ConsultarDisciplina" method="post">
			<div>
			<%
			if(request.getAttribute("disciplinas") != null){
				List<?> disciplinas = (List<?>) request.getAttribute("disciplinas");
				for(int c=0; c<(disciplinas.size()) && c<10; c++){
					Disciplina disciplina = (Disciplina) disciplinas.get(c);
			%>
			<div>
				<div class="fo">
					<span><%out.print("Nome: " + disciplina.getNome()); %></span>
					<span><%out.print("Valor: " + disciplina.getValor()); %></span>
					<span><%out.print("Professor: " + disciplina.getCdprofessor()); %></span>
					<input id="Balterar" type="submit" name="salvar"
						value="Alterar">
					<input id="Bapagar" type="submit" name="salvar"
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