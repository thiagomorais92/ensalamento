<jsp:include page="../templates/topo.jsp"/>

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title text-center">CADASTRO DE FUNCIONÁRIO</h3>
			</div>
			
			<div class="panel-body">
				
				<form action="#" class="form-horizontal">
					<fieldset>
						<legend>Dados Pessoais</legend>
						<div class="form-group">
							<label for="nome" class="col-sm-2 control-label">Nome</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="nome">
							</div>
						</div>
						
						<div class="form-group">
							<label class="col-sm-2 control-label">Sexo</label>
							<div class="col-sm-4">
								<label class="radio-inline">
									<input type="radio" name="sexo" id="feminino" value="FEMININO"> Feminino
								</label>

								<label class="radio-inline">
									<input type="radio" name="sexo" id="masculino" value="MASCULINO"> Masculino
								</label>
							</div>
						</div>
						
						<div class="form-group">
							<label for="pai" class="col-sm-2 control-label">Nome do Pai</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="pai">
							</div>
						</div>	
						
						<div class="form-group">
							<label for="mae" class="col-sm-2 control-label">Nome da Mãe</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="mae">
							</div>
						</div>													
						
						<div class="form-group">
							<label for="data-nascimento" class="col-sm-2 control-label">Data de Nascimento</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="data-nascimento">
							</div>
						</div>
						
						<div class="form-group">
							<label for="cpf" class="col-sm-2 control-label">CPF</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="cpf">
							</div>
						</div>
						
						<div class="form-group">
							<label for="rg" class="col-sm-2 control-label">RG</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="rg">
							</div>
						</div>	
						
						<div class="form-group">
							<label for="tel" class="col-sm-2 control-label">Telefone</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id=""tel">
							</div>
						</div>						
																					
					</fieldset>
					
					<fieldset>
						<legend>Contato</legend>
						<div class="form-group">
							<label for="email" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-4">
								<input type="email" class="form-control" id="email">
							</div>
						</div>
						
						<div class="form-group">
							<label for="telefone" class="col-sm-2 control-label">Telefone</label>
							<div class="col-sm-4">
								<input type="tel" class="form-control" id="telefone">
							</div>
						</div>
					</fieldset>
					
					<fieldset>
						<legend>Endereço</legend>
						<div class="form-group">
							<label for="logradouro" class="col-sm-2 control-label">Logradouro</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="logradouro">
							</div>
						</div>
						
						<div class="form-group">
							<label for="cidade" class="col-sm-2 control-label">Cidade</label>
							<div class="col-sm-4">
								<select class="form-control" name="cidade" id="cidade">
									<option value="Brasília">Brasília</option>
								</select>
							</div>
						</div>
						
						<div class="form-group">
							<label for="uf" class="col-sm-2 control-label">UF</label>
							<div class="col-sm-4">
								<select class="form-control" name="uf" id="uf">
									<option value="AC">AC</option>
									<option value="AL">AL</option>
									<option value="AM">AM</option>
									<option value="AP">AP</option>
									<option value="BA">BA</option>
									<option value="CE">CE</option>
									<option value="DF">DF</option>
									<option value="ES">ES</option>
									<option value="GO">GO</option>
									<option value="MA">MA</option>
									<option value="MG">MG</option>
									<option value="MS">MS</option>
									<option value="MT">MT</option>
									<option value="PA">PA</option>
									<option value="PE">PE</option>
									<option value="PI">PI</option>
									<option value="PR">PR</option>
									<option value="RJ">RJ</option>
									<option value="RN">RN</option>
									<option value="RO">RO</option>
									<option value="RR">RR</option>
									<option value="RS">RS</option>
									<option value="SC">SC</option>
									<option value="SE">SE</option>
									<option value="SP">SP</option>
									<option value="TO">TO</option>
								</select>
							</div>
						</div>
					</fieldset>
					
					<fieldset>
						<legend>Informações Adicionais</legend>

						<div class="form-group">
							<label for="cargo" class="col-sm-2 control-label">Cargo</label>
							<div class="col-sm-4">
								<select class="form-control" name="cargo" id="cargo">
									<option value="Cargo 1">Cargo 1</option>
									<option value="Cargo 2">Cargo 2</option>
								</select>
							</div>
						</div>			
						
						<div class="form-group">
							<label for="pis" class="col-sm-2 control-label">PIS</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="pis">
							</div>
						</div>	
						
						<div class="form-group">
							<label for="dtadmis" class="col-sm-2 control-label">Data de Admissão</label>
							<div class="col-sm-4">
									<input type="text" class="form-control" id="dtadmis">
							</div>
						</div>			
						
						<div class="form-group">
							<label for="grauescolar" class="col-sm-2 control-label">Grau Escolar</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="grauescolar">
							</div>
						</div>						
						
						<div class="form-group">
							<label for="naturalidade" class="col-sm-2 control-label">Naturalidade</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="naturalidade">
							</div>
						</div>
						
						<div class="form-group">
							<label for="nacionalidade" class="col-sm-2 control-label">Nacionalidade</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="nacionalidade">
							</div>
						</div>																			
					</fieldset>
					
					<button type="submit" class="btn btn-primary">
						<span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Gravar
					</button>
				</form>
			</div>
		</div>
	</div>

<jsp:include page="../templates/footer.jsp"/>
