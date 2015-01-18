<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<jsp:include page="../templates/topo.jsp"/>

<div class="jumbotron">
	<div class="container">
		<form class="horizontal-form" action="cadastrar">
		<div class="form-froup">
		<form:errors path="sala.capacidade" cssStyle="color:red;"/>
		<label for="capacidade">Capacidade de alunos</label>
		<input type="text" class="form-control" id="capacidade" placeholder="Capacidade de alunos"/>
	</div>
	
	<div class="form-group">
	   	<label for="nome">Nome da Turma</label>
	   	<form:errors path="sala.nome" cssStyle="color:red;"/>
	   	<input type="text" class="form-control" id="nome" placeholder="Nome da Turma"/>
	</div>
	
	<button type="submit" class="btn btn-success">Cadastrar</button>
</form>	
	</div>
</div>


<jsp:include page="../templates/footer.jsp" />