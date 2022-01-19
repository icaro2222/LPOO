
<%@page import="Model.Semestre"%>
<%@page import="Model.Professor"%>
<%@page import="Model.Aluno"%>
<%@page import="Model.Matricula"%>
<%@page import="java.util.List.*" %>
<%@page import="java.util.ArrayList" %>
<%@page import="br.servlets.cadastro.cadastrarMatriculaAlunoController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>SysSchool</title>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../css/styles1.css">
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
		<form action="../CadastrarMatriculaAluno" method="post" class="calunoForm">
			<div>
				<h2>Dados de aluno</h2><br>
			</div>
			<div>
				<label><strong>Nome:</strong></label><input type="text"
					name="nome">
			</div>
			<div>
				<label><strong>Número de matrícula:</strong></label><input type="text"
					name="numMatricula">
			</div>
			<div>
				<label><strong>Status:</strong></label><input type="text"
					name="status">
			</div>
			<br>
			<div>
				<h2>Dados da Matricula</h2><br>
			</div>
			<div>
				<label><strong>Curso:</strong></label><input type="text"
					name="cdcurso">
			</div>
			<div>
				<label><strong>Aluno:</strong></label>
				<select id="cdaluno" name="aluno">
					<%ArrayList<?> alunos = new Aluno().consultarPorId(-1);
					for(int s=0; s<(alunos.size()) && s<6; s++){
					Aluno aluno = (Aluno) alunos.get(s); 
					%>
					<option value="<%out.print(aluno.getCdaluno());%>"><%out.print(aluno.getNome()); %></option>
					<%} %>
				</select>
			</div>
			<div>
				<label><strong>Semestre:</strong></label>
			<select id="cdaluno" name="aluno">
				<%ArrayList<?> semestres = new Semestre().consultarPorId(-1);
				for(int s=0; s<(semestres.size()) && s<6; s++){
				Semestre semestre = (Semestre) semestres.get(s); 
				%>
				<option value="<%out.print(semestre.getCdsemestre());%>"><%out.print(semestre.getAno()); %></option>
				<%} %>
			</select>
			</div>
			<div>
				<label><strong>Valor:</strong></label><input type="number"
					name="valor">
			</div>
			<div>
				<label><strong>Turma:</strong></label><input type="text"
					name="cdturma">
			</div>
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Cadastrar Aluno">
			</div>
		</form>
	</main>
</body>
</html>