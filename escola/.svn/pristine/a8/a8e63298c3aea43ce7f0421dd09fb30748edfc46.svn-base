package br.com.lucas.escola.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.lucas.escola.dao.AlunoDao;
import br.com.lucas.escola.model.Aluno;

/**
 * 
 * Classe para testar todas as funcionalidades do Aluno.
 * @author Lucas
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
@Transactional
public class AlunoControllerTest {

	@Autowired
	AlunoDao dao;
	
	@Test
	public void eHParaSalvarAluno() {
		Aluno aluno = new Aluno();
		aluno.setNome("Lucas Moreira");

		dao.salvar(aluno);
//		Aluno alunoPesquisado = dao.findAlunoByNome("Lucas Moreira");
		List<Aluno> alunosPesquisados = dao.getAlunosNaoEnsaladosByNome("Lucas");
		Assert.assertEquals("Lucas Moreira", alunosPesquisados.get(0).getNome());
	}
	
	@Test
	public void recuperarAlunosDeUmaSala() {
		List<Aluno> alunosDessaSala = dao.findAlunoByIdSala(6);
		Assert.assertEquals(true, alunosDessaSala.size() == 0);
	}
	
	@Test
	public void eHparaRecuperarAlunosPeloIdDeUmaDeterminadaSala(){
		List<Aluno> alunos = dao.findAlunosByIdSala(6);
		Assert.assertEquals(true, alunos.size() == 0);
	}	
	
	
}
