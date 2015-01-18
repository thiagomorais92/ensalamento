<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../templates/topo.jsp"/>

<div class="container">
	<h2>Lista de Salas Encontradas</h2>
	<table class="table table-bordered table-hover">
		<tr align="center">
			<th>Número da sala</th>
			<th>Capacidade de alunos</th>
			<th>Turma</th>
			<td></td>
		</tr>
		<tr>
			<c:if test="${empty salas}">
				<td>Nenhuma sala encontrada!</td>
			</c:if>
		</tr>
		<c:forEach items="${salas}" var="sala">
			<tr>	
				<td>${sala.id}</td>
				<td>${sala.capacidade}</td>
				<td>${sala.nomeSala}</td>
				<td><a href="<%=request.getContextPath()%>/sala/alunos?id=${sala.id}">Alunos</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="salas-nova">Crie uma nova sala!</a>
</div>

<jsp:include page="../templates/footer.jsp"/>