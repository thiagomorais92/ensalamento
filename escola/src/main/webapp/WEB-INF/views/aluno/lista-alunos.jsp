<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alunos da Faculdade</title>
</head>
<body>
	<h2>Lista de Alunos</h2>
	<table>
		<tr>
			<th>Nome</th>
			<th>Idade</th>
			<th>Turma</th>
		</tr>
		<c:forEach items="${alunos}" var="aluno">
			<tr>
				<td>${aluno.nome}</td>
				<td>${aluno.idade}</td>

				<c:if test="${!empty aluno.turma}">
					<td>${aluno.turma}</td>
					<td><a href="#">Matricular Aluno</a></td>
				</c:if>

				<c:if test="${empty aluno.turma}">
					<td>Nenhum aluno matriculado!</td>
				</c:if>
			</tr>
		</c:forEach>
	</table>
</body>
</html>