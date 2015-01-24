package br.com.lucas.escola.controller;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.lucas.escola.model.Cargo;
import br.com.lucas.escola.model.Cidade;
import br.com.lucas.escola.model.Endereco;
import br.com.lucas.escola.model.Funcionario;
import br.com.lucas.escola.model.Uf;
import br.com.lucas.escola.services.FuncionarioService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
@Transactional
public class FuncionarioControllerTest {
	
	@Autowired
	private FuncionarioService funcionarioService;
	

	/**
	 * Teste para saber se a persistência dessa entidade está funcionando corretamente.
	 */
	@Test
	public void saveTest() {
		Cargo c = new Cargo();
		c.setDescricao("Aux. Técnico");
		c.setFuncao("Ajudar os técnicos");
		
		Uf uf = new Uf();
		uf.setDescricao("Distrito Federal");
		uf.setSiglaUf("DF");
		
		Cidade cidade = new Cidade();
		cidade.setCodMunicipio("123123");
		cidade.setDescricao("Brasília");
		cidade.setIdCidade("1234");
		cidade.setUf(uf);
		
		Endereco endereco = new Endereco();
		endereco.setBairro("Taguatinga");
		endereco.setCep("72110120");
		endereco.setLogradouro("LOGRA");
		endereco.setNumero("11");
		endereco.setCidade(cidade);

		Funcionario f = new Funcionario();
		f.setNome("Fulano da Silva");
		f.setCpf("123.456.789-09");
		f.setRg("4559.658");
		f.setDtnasc(new Date());
		f.setCargo(c);
		f.setPis("1232331232131");
		f.setNacionalidade("BRASILEIRA");
		f.setNaturalidade("BRASILEIRA");
		f.setEndereco(endereco);
		f.setEmail("email@email.com");
		f.setTelefone("(61) 1234-5678");
		f.setNomepai("Fulano Pai Silva");
		f.setNomemae("Fulana Pires Silva");
		f.setDataAdmis(new Date());
		f.setGrauesc("Ensino Médio Completo");
		f.setSexo('M');
		
		funcionarioService.persist(f);
		
		Assert.assertNotNull(f.getIdPessoa());
		
	}
	
}
