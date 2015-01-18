package br.com.lucas.escola.controller;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.lucas.escola.dao.SalaDao;
import br.com.lucas.escola.model.Aluno;
import br.com.lucas.escola.model.Sala;

/**
 * Classe para testar funcionalidades de Sala.
 * @author Lucas
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
@Transactional
public class SalaControllerTest {

	@Autowired
	private SalaDao dao;
	
	@Test
	public void eHParaAdicionarSala() {
		Sala sala = new Sala();
		sala.setCapacidade(3);
		sala.setAlunos(null);
		sala.setNomeSala("5ªA");		

		dao.salvar(sala);
		
		List<Sala> salas = dao.getAll();
		
		Assert.assertEquals(true, salas.size() > 0);
	}
	
	@Test	
	public void recuperarSalaPorId(){
		Sala sala = dao.findSalaById(6);
		Assert.assertEquals(true, sala != null);
	}

}
