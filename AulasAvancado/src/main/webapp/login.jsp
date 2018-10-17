<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<%@ include file="template/header.jsp"%>
	<link rel="stylesheet" href="template/css/login.css" type="text/css" />
<body>
	<div id="form-container" style="width: 30%;">
		<form action="/AulasAvancado/login" method="post">
		       <h1 class="text-center">Login</h1>
		
		       <div class="form-group">
		           <label class="sr-only" for="login">Usuário</label>
		           <div class="input-group">
		               <div class="input-group-addon">
		                   <span class="glyphicon glyphicon-user"></span>
		               </div>
		               <input type="text" name="usuario" class="form-control" placeholder="Seu login de usuário" required="required">
		           </div>
		       </div>
		
		       <div class="form-group">
		           <label class="sr-only" for="senha">Senha</label>
		           <div class="input-group">
		               <div class="input-group-addon">
		                   <span class="glyphicon glyphicon-lock"></span>
		               </div>
		               <input type="password" name="senha" class="form-control" placeholder="Digite sua senha" required="required">
		           </div>
		       </div>
		
		       <div class="form-group">
		           <input type="submit" value="Entrar" class="btn btn-success form-control">
		       </div>
		
		       <div class="form-group">
		           Não é registrado? <a href="cadastro.html">Crie uma conta</a>.
		       </div>
		   </form>
    </div>
</body>
</html>