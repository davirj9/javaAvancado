<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<%@ include file="template/header.jsp"%>
<body>
	<%-- <%@ include file="template/menu.jsp"%> --%>
	<div class="container">
		<form action="/Projeto1/inicio" method="post">
			<p>Consulte um livro:</p>
			<input type="text" name="livro">
			<input type="submit" value="Enviar">
		</form>
	</div>
	<%-- <%@ include file="template/footer.jsp"%> --%>
</body>
</html>