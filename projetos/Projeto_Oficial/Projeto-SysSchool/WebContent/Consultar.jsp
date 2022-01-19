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
		<ul>
			<li><img href="Welcome.jsp" src="img/2.png"height="30px"></li>
			<div class="meuh1"> 
			<li><a class="meua" href="Welcome.jsp">SysSchool</a></li>
			</div>
			<li><a href="Cadastrar.jsp">Fazer novo cadastro</a></li>
		</ul>
	</nav>
	<main class="bananaMain">
		<form action="" method="post" class="bananaForm"> 
			<img href="Welcome.jsp" src="img/3.gif"height="150px"><br>
			<div class="lim">
				<li><a href="aluno/ConsultarAluno.jsp">Consultar Auno</a></li>
				<li><a href="curso/ConsultarCurso.jsp">Consultar Curso</a></li>
				<li><a href="turma/ConsultarTurma.jsp">Consultar Turma</a></li>
			</div>
			<div class="lim">
				<li><a href="professor/ConsultarProfessor.jsp">Consultar Professor</a></li>
				<li><a href="semestre/ConsultarSemestre.jsp">Consultar Semestre</a></li>
				<li><a href="disciplina/ConsultarDisciplina.jsp">Consultar Disciplina</a></li>
			</div>
			<div class="lim">
				<li><a href="teste/Consultar.jsp">Consultar Teste</a></li>
				<li><a href="Consultar.jsp">Consultar #</a></li>
				<li><a href="Consultar.jsp">Consultar #</a></li>
			</div>
		</form>
	</main>
</body>
</html>