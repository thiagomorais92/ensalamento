<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<jsp:include page="../templates/topo.jsp"/>
<c:url var="procurar" value="../aluno/nao-ensalados"/>
<c:url var="remover" value="../aluno/remover"/>

<div class="container">
	<div class="jumbotron">
		<h1>Lista de Alunos da Sala ${sala.id}</h1>
		<h2>Capacidade de alunos: ${sala.capacidade}</h2>
		<h2>Alunos na Sala: ${fn:length(alunos)}</h2>	
	</div>

	<table class="table table-bordered table-hover">
		<tr>
			<th>Matrícula</th>
			<th>nome</th>
			<td></td>
		</tr>
		<tr>
			<c:if test="${empty alunos}">
				<c:if test="${empty alunos}">
					<td>Nenhum aluno nessa sala!</td>
					<td>-</td>
					<td></td>
				</c:if>
			</c:if>
		</tr>
		<c:forEach items="${alunos}" var="aluno">
			<tr>
				<td>${aluno.id}</td>
				<td>${aluno.nome}</td>
				<td><a href="${remover}?idAluno=${aluno.id}&idSala=${sala.id}">Excluir</a></td>
			</tr>
		</c:forEach>

		<tr>
			<c:choose>
				<c:when test="${fn:length(alunos) == sala.capacidade}">
				Sala cheia!
				</c:when>
				<c:otherwise>
					<a href="${procurar}?numSala=${sala.id}">Adicionar
						alunos à sala</a>
				</c:otherwise>
			</c:choose>
		</tr>
	</table>	
</div>

<jsp:include page="../templates/footer.jsp"/>