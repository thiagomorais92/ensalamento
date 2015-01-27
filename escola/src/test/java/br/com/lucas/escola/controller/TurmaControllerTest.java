package br.com.lucas.escola.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.lucas.escola.enums.DIAS;
import br.com.lucas.escola.enums.Turno;
import br.com.lucas.escola.model.Aluno;
import br.com.lucas.escola.model.Cidade;
import br.com.lucas.escola.model.Curso;
import br.com.lucas.escola.model.DiaDaSemana;
import br.com.lucas.escola.model.Endereco;
import br.com.lucas.escola.model.Modulo;
import br.com.lucas.escola.model.Turma;
import br.com.lucas.escola.model.Uf;
import br.com.lucas.escola.services.TurmaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
@Transactional
public class TurmaControllerTest {

	
	@Autowired
	TurmaService turmaService;
	
	@Test
	public void testSave() {
		
		//alunos
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		
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
		
		alunos.add(a);
		
		//curso
		
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
		
		//turma
		
		Turma t = new Turma();
		t.setCurso(c);
		t.setDataDeInicio(new Date());
		t.setDescricao("jsapiodjraiopsrhdsaiorpah");
		
		List<DiaDaSemana> diasDaSemana = new ArrayList<DiaDaSemana>();
		DiaDaSemana dia = new DiaDaSemana();
		dia.setDiaDaSemana(DIAS.SEXTA);
		dia.setHoraFim(new Date());
		dia.setHoraFim(new Date());
		diasDaSemana.add(dia);
		
		t.setDiasDaSemana(diasDaSemana);
		t.setVagas(5);
		t.setAlunos(alunos);
		
		turmaService.persist(t);
		
		Assert.assertNotNull(t.getCodTurma());
	}
	
	
}
