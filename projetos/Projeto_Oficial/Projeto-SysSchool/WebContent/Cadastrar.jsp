<%@page import="Dao.dashboardDao"%>
<%@page import="java.util.List.*" %>
<%@page import="java.util.List" %>
<%@page import="Model.Curso"%>
<%@page import="Model.Turma"%>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
	<title>Cadastros</title>
	<link rel="shortcut icon" href="img/2.png">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/styles1.css">
    <link rel="stylesheet" href="css/style-login.css">
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.0/chart.min.js" type="text/javascript"></script>
   </head>
<body>
	<%
	String usuario = (String) session.getAttribute("usuario");
	String professor= (String) session.getAttribute("professor");
		if(usuario == null && professor == null){
			response.sendRedirect("Login.jsp");
		}
		double valor[] = new dashboardDao().dados();
	%>
	

  <div class="sidebar">
    <div class="logo-details">
      <i><img src="img/2.png"height="30px"></i>
      <span class="logo_name">SysSchool</span></a>
    </div>
      <ul class="nav-links">
        <li>
          <a href="Dashboard.jsp">
            <i class='bx bx-grid-alt' ></i>
            <span class="links_name">Dashboard</span>
          </a>
        </li>
        <li>
          <a href="matricula/CadastrarMatriculaAluno.jsp">
            <i class='bx bx-box' ></i>
            <span class="links_name">Matricular Aluno</span>
          </a>
        </li>
        <li>
          <a href="curso/CadastrarCurso.jsp">
            <i class='bx bx-box' ></i>
            <span class="links_name">Cadastrar Curso</span>
          </a>
        </li>
        <li>
          <a href="turma/CadastrarTurma.jsp">
            <i class='bx bx-box' ></i>
            <span class="links_name">Cadastrar Turma</span>
          </a>
        </li>
        <li>
          <a href="professor/CadastrarProfessor.jsp">
            <i class='bx bx-box' ></i>
            <span class="links_name">Cadastrar Professor</span>
          </a>
        </li>
        <li>
          <a href="semestre/CadastrarSemestre.jsp">
            <i class='bx bx-box' ></i>
            <span class="links_name">Cadastrar Semestre</span>
          </a>
        </li>
        <li>
          <a href="disciplina/CadastrarDisciplina.jsp">
            <i class='bx bx-box' ></i>
            <span class="links_name">Cadastrar Disciplina</span>
          </a>
        </li>
        <li>
          <a href="nota/CadastrarNota.jsp">
            <i class='bx bx-box' ></i>
            <span class="links_name">Cadastrar Nota</span>
          </a>
        </li>
        <li>
          <a href="matriculaDisciplina/CadastrarMatriculaDisciplina.jsp">
            <i class='bx bx-box' ></i>
            <span class="links_name">Matricular Disciplina ao Aluno</span>
          </a>
        </li>
        <li>
          <a href="funcionario/CadastrarFuncionario.jsp">
            <i class='bx bx-box' ></i>
            <span class="links_name">Cadastrar Funcion�rio</span>
          </a>
        </li>
        <li class="log_out">
          <a href="Deslogar.jsp">
            <i class='bx bx-log-out'></i>
            <span class="links_name">Log out</span>
          </a>
        </li>
      </ul>
  </div>
  <section class="home-section">
    <nav>
      <div class="sidebar-button">
        <i class='bx bx-menu sidebarBtn'></i>
        <span class="dashboard">Cadastrar</span>
      </div>
    </nav>
    <div class="home-content">
      <div class="overview-boxes">
      	<img src="img/5.gif">
      </div>
    </div>
  </section>

  <script>
   let sidebar = document.querySelector(".sidebar");
let sidebarBtn = document.querySelector(".sidebarBtn");
sidebarBtn.onclick = function() {
  sidebar.classList.toggle("active");
  if(sidebar.classList.contains("active")){
  sidebarBtn.classList.replace("bx-menu" ,"bx-menu-alt-right");
}else
  sidebarBtn.classList.replace("bx-menu-alt-right", "bx-menu");
}
 </script>

</body>
<script src="css/script.js"></script>
</body>
</html>