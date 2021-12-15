
<%@page import="Model.Curso"%>
<%@page import="Model.Semestre"%>
<%@page import="Model.Turma"%>
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
				<label><strong>Curso:</strong></label>
			<select name="cdcurso">
				<%ArrayList<?> cursos = new Curso().consultarPorId(-1);
				for(int s=0; s<(cursos.size()) && s<6; s++){
				Curso curso = (Curso) cursos.get(s); 
				%>
				<option value="<%out.print(curso.getCdcurso());%>"><%out.print(curso.getNomecurso()); %></option>
				<%} %>
			</select>
			</div>
			<select name="cdaluno">
				<%ArrayList<?> alunos = new Aluno().consultarPorId(-1);
				%>
				<option value="<%out.print(alunos.size());%>"></option>
			</select>
			<div>
				<label><strong>Semestre:</strong></label>
			<select name="cdsemestre">
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
				<label><strong>Turma:</strong></label>
				<select name="cdturma">
				<%ArrayList<?> turmas = new Turma().consultarPorId(-1);
				for(int s=0; s<(turmas.size()) && s<6; s++){
				Turma turma = (Turma) turmas.get(s); 
				%>
				<option value="<%out.print(turma.getCdturma());%>"><%out.print(turma.getNometurma()); %></option>
				<%} %>
			</select>
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