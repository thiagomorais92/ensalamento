<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../templates/topo.jsp"/>

<c:url var="cadastrar" value="cadastrar"/>
<div class="jumbotron">
	<div class="container">
		<div class="row">
			<form action="${cadastrar}" class="form-horizontal" method="post">
			<div class="form-group">
				<label for="nome"  class="control-label col-xs-1">Nome</label>
				<div class="col-xs-5">
					<form:errors path="aluno.nome" cssStyle="color:red;"/>
					<input type="text" name="nome" placeholder="Digite o nome do aluno a ser cadastrado" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<div class="col-xs-10">	
					<input type="submit" value="Cadastrar" class="btn btn-large btn-success">
				</div>
			</div>			
		</form>
		</div>
	</div>
</div>

<jsp:include page="../templates/footer.jsp"/>
