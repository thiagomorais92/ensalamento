package br.com.lucas.escola.controller;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Classe para testar funcionalidades de Sala.
 * @author Lucas
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
@Transactional
public class SalaControllerTest {

//	@Autowired
//	private SalaDao dao;
//	
//	@Test
//	public void eHParaAdicionarSala() {
//		Turma sala = new Turma();
//		sala.setCapacidade(3);
//		sala.setAlunos(null);
//		sala.setNomeSala("5�A");		
//
//		dao.salvar(sala);
//		
//		List<Turma> salas = dao.getAll();
//		
//		Assert.assertEquals(true, salas.size() > 0);
//	}
//	
//	@Test	
//	public void recuperarSalaPorId(){
//		Turma sala = dao.findSalaById(6);
//		Assert.assertEquals(true, sala != null);
//	}

}
