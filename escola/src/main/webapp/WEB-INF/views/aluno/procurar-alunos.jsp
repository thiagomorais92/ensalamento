<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../templates/topo.jsp"/>

<c:url value="procurar" var="procurar"/>
<c:url value="adicionar" var="adicionar"/>
<div class="container">
	<div class="jumbotron">
	<form action="${procurar}" class="form-inline" method="post">
		<input type="hidden" name="numSala" value="${sala.id}"/>
		<div class="form-group">
			<label>Nome do Aluno</label>
			<input type="text" name="nome" class="form-control" placeholder="Nome do aluno">			
		</div>	
		<button type="submit" class="btn btn-success">
		  <span class="glyphicon glyphicon-search" aria-hidden="true"></span> Procurar Aluno
		</button>	
	</form>
	</div>
	<br /> <br /> 	
	<table class="table table-bordered table-hover">
		<c:if test="${empty alunos}">
			<tr>
				<td>Nenhum aluno encontrado!</td>
			</tr>
		</c:if>
		<tr>
			<c:forEach items="${alunos}" var="aluno">

			<tr>
				<td>${aluno.nome}</td>
				<td><a href="${adicionar}?idSala=${sala.id}&idAluno=${aluno.id}">Adicionar</a></td>
			</tr>	
			</c:forEach>
		<tr>			
	</table>
</div>

<jsp:include page="../templates/footer.jsp"></jsp:include>	