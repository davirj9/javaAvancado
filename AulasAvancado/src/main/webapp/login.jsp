<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Aula java avançado</title>
		<style type="text/css">
		  @import url("css/login.css");
		</style>
	</head>
<body>
	<form action="/AulasAvancado/login" method="post">
		<div class="container">
	    <label for="usuario"><b>Usuario</b></label>
	    <input type="text" placeholder="Insira seu usuario" name="usuario" required>
	
	    <label for="senha"><b>Senha</b></label>
	    <input type="password" placeholder="Insira sua senha" name="senha" required>
	
	    <button type="submit">Login</button>
	    <label>
	      <input type="checkbox" checked="checked" name="remember"> Remember me
	    </label>
	  </div>
	
	  <div class="container" style="background-color:#f1f1f1">
	    <button type="button" class="cancelbtn">Cancel</button>
	    <span class="psw">Forgot <a href="#">password?</a></span>
	  </div>
	</form>
</body>
</html>