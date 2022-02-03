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
	<main class="bananaMain">
		<form action="" method="post" class="bananaForm">
			<img href="Welcome.jsp" src="img/5.gif"height="150px"><br>
			<div class="lim">
				<%if(usuario != null){%>
				<li><a href="matricula/CadastrarMatriculaAluno.jsp">Matricular Aluno</a></li>
				<li><a href="curso/CadastrarCurso.jsp">Cadastrar Curso</a></li>
				<li><a href="turma/CadastrarTurma.jsp">Cadastrar Turma</a></li>
			</div>
			<div class="lim">
				<li><a href="professor/CadastrarProfessor.jsp">Cadastrar Professor</a></li>
				<li><a href="semestre/CadastrarSemestre.jsp">Cadastrar Semestre</a></li>
				<li><a href="disciplina/CadastrarDisciplina.jsp">Cadastrar Disciplina</a></li>
			</div>
			<div class="lim"><%} %>
				<%if(professor != null || usuario != null){%>
				<li><a href="nota/CadastrarNota.jsp">Cadastrar Nota</a></li><%}%>
				<%if(usuario != null){%>
				<li><a href="matriculaDisciplina/CadastrarMatriculaDisciplina.jsp">Matricular Disciplinas ao aluno</a></li>
				<li><a href="funcionario/CadastrarFuncionario.jsp">Cadastrar Funcionário</a></li><%}%>
			</div>
		</form>
	</main>
</body>
</html>