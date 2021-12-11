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
		</ul>
	</nav>
	<main class="bananaMain">
		<form action="" method="post" class="bananaForm">
			<h2>SysSchool</h2><br>
          <h3 class="login-head"><i class="fa fa-lg fa-fw fa-user"></i>Entrar</h3><br>
          <div class="form-group">
            <label class="control-label">E-MAIL</label>
            <input class="form-control" type="email" name="login" placeholder="E-mail" autofocus required>
          </div>
          <div class="form-group">
            <label class="control-label">SENHA</label>
            <input class="form-control" type="password" name="senha" placeholder="Senha" required>
          </div>
          <div>
				<input id="bananaButton" type="submit" name="salvar" value="Entar">
			</div>
			<div class="newslink">
         <input type="hidden" name="submit_newsletter" />
         <a  href="Welcome.jsp" >ENVIAR</a>
      </div>
		</form>
	</main>
</body>
</html>