package br.com.lucas.escola.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.lucas.escola.enums.Turno;
import br.com.lucas.escola.model.Curso;
import br.com.lucas.escola.model.Modulo;
import br.com.lucas.escola.services.CursoService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
@Transactional
public class CursoControllerTest {

	@Autowired
	CursoService cursoService;
	
	@Test
	public void testSave() {
		Curso c = new Curso();
		
		Modulo modulo1 = new Modulo();
		modulo1.setDescricao("WINDOWS");
		
		Modulo modulo2 = new Modulo();
		modulo2.setDescricao("LINUX");
		
		List<Modulo> modulos = new ArrayList<Modulo>();
		modulos.add(modulo1);
		modulos.add(modulo2);
		
		
		c.setCargaHoraria("120 horas");
		c.setDesconto(null);
		c.setNomeCurso("Curso de Informática");
		c.setTurno(Turno.TURNO_NOTURNO);
		c.setValor(new BigDecimal(250.00));
		c.setModulos(modulos);
		
		cursoService.persist(c);
		
		Assert.assertNotNull(c.getIdCurso());
	}

}
