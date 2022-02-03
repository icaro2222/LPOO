<%@page import="Model.MatriculaDisciplina"%>
<%@page import="Dao.MatDisciplinaDao"%>
<%@page import="java.util.List" %>
<%@page import="Model.Curso"%>
<%@page import="Model.Semestre"%>
<%@page import="Model.Disciplina"%>
<%@page import="Model.Professor"%>
<%@page import="Model.Aluno"%>
<%@page import="Model.Matricula"%>
<%@page import="br.servlets.buscarNota.buscarNotaController"%>
<%@page import="br.servlets.nota.notaController"%>
<%@page import="br.servlets.consultarAlunoController"%>
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
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	<%
	String usuario = (String) session.getAttribute("usuario");
	String professor= (String) session.getAttribute("professor");
	if(usuario == null && professor == null){
			response.sendRedirect("Login.jsp");
		}	
	%>
	
	<nav class="bananaNav">
		<ul>
			<li><img src="img/2.png" height="30px"></li>
			<div class="meuh1"> 
				<li><a class="meua" href="Dashboard.jsp">SysSchool</a></li>
			</div>
			<li><a href="Deslogar.jsp">Log out</a></li>
			<li><img src="img/LogOut.png" height="30px"></li>
		</ul>
	</nav>
	<main class="matriculaDisMain">
    <div class="modal">
		<img src="img/sucess3.gif" alt="sucesso">
    </div>
		<form action="buscarNota" method="post"  class="DisForm">
			<div>
				<h2>Dados de aluno</h2><br> 
			</div>
			<div>
				<label><strong>Cpf:</strong></label><input type="text"
					name="nome">
			</div>
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Buscar Aluno">
			</div>
		</form>
		<form action="CadastrarNota" name="nota" method="post"  class="bananaForm">
			<div>
				<label><strong>Aluno:</strong></label>
				<select name="cdaluno">
				<%
				Aluno aluno = null; 
				if(request.getAttribute("alunos") == null){%>
					<option value="<%out.print(0);%>"><%out.print("Nenhum Aluno encontrado"); %></option>
				</select > 
				</div>
				<br>
				<h2>CPF inválido!</h2><br> 
				<h2>Aluno não encontado, verifique o cpf por favor!</h2><br> 
			</div>
			<br>
				<%}else{
					List<?> alunos = (List<?>) request.getAttribute("alunos");
					for(int c=0; c<(alunos.size()); c++){
						aluno = (Aluno) alunos.get(c);
				%>
				<option value="<%out.print(aluno.getCdaluno());%>"><%out.print(aluno.getNome()); %></option>
				<%} %>
				</select > 
			</div>
			<br>
			<div>
				<h2>Disciplina</h2><br>
			</div>
			<div>
				<label><strong>Disciplina:</strong></label>
				<select name="cddisciplina">
					<%
					ArrayList<?> disciplinas = new Disciplina().consultarPorId(aluno.getCdaluno());
					for(int s=0; s<(disciplinas.size()); s++){
						Disciplina disciplina = (Disciplina) disciplinas.get(s); 
					%>
					<option value="<%out.print(disciplina.getCddisciplina());%>"><%out.print(disciplina.getNome()); %></option>
					<%} %>
				</select >
			</div>
			<div>
				<label><strong>Nota:</strong></label><input type="text"
					name="nota" maxlength="2" max="2" min="1" required="required">
			</div>
			<div>
				<label><strong>Referência:</strong></label><input type="text"
					name="referencia" required="required">
			</div>
			<br>
			<div>
				<input onclick="validarNota()" id="bananaButton" type="submit" name="salvar"
					value="Cadastrar Nota">
			</div>
			<%} %>
		</form>
	</main>
<script src="css/script.js"></script>
</body>
</html>