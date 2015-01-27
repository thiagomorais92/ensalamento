package br.com.lucas.escola.controller;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.lucas.escola.dao.Dao;
import br.com.lucas.escola.model.Aluno;
import br.com.lucas.escola.model.Cidade;
import br.com.lucas.escola.model.Endereco;
import br.com.lucas.escola.model.Uf;
import br.com.lucas.escola.services.AlunoService;

/**
 * 
 * Classe para testar todas as auncionalidades do Aluno.
 * @author Lucas
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
@Transactional
public class AlunoControllerTest {

	@Autowired
	AlunoService alunoService;
	
	@Test
	public void saveTest() {
		
		Uf uf = new Uf();
		uf.setDescricao("Distrito aederal");
		uf.setSiglaUf("Df");
		
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

		Aluno a = new Aluno();
		a.setNome("Fulano da Silva");
		a.setCpf("123.456.789-09");
		a.setRg("4559.658");
		a.setDtnasc(new Date());
		a.setNacionalidade("BRASILEIRA");
		a.setNaturalidade("BRASILEIRA");
		a.setEndereco(endereco);
		a.setEmail("email@email.com");
		a.setTelefone("(61) 1234-5678");
		a.setNomepai("Fulano Pai Silva");
		a.setNomemae("Fulana Pires Silva");
		a.setGrauesc("Ensino Médio Completo");
		a.setSexo('M');
		
		alunoService.persist(a);
		
		Assert.assertNotNull(a.getIdPessoa());
	}
	
	
}
