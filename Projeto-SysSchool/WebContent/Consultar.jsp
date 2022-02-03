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
			<img href="Welcome.jsp" src="img/3.gif"height="150px"><br>
			<div class="lim">
				<li><a href="aluno/ConsultarAluno.jsp">Consultar Aluno</a></li>
				<li><a href="curso/ConsultarCurso.jsp">Consultar Curso</a></li>
				<li><a href="turma/ConsultarTurma.jsp">Consultar Turma</a></li>
			</div>
			<div class="lim">
				<li><a href="professor/ConsultarProfessor.jsp">Consultar Professor</a></li>
				<li><a href="semestre/ConsultarSemestre.jsp">Consultar Semestre</a></li>
				<li><a href="disciplina/ConsultarDisciplina.jsp">Consultar Disciplina</a></li>
			</div>
			<div class="lim">
				<li><a href="Consultar.jsp">Consultar #</a></li>
				<li><a href="Consultar.jsp">Consultar #</a></li>
				<li><a href="Consultar.jsp">Consultar #</a></li>
			</div>
		</form>
	</main>
</body>
</html>