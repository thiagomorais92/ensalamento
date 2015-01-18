package br.com.lucas.escola.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lucas.escola.dao.AlunoDao;
import br.com.lucas.escola.dao.SalaDao;
import br.com.lucas.escola.model.Aluno;
import br.com.lucas.escola.model.Sala;

/**
 * 
 * @author Lucas Moreira
 * Clases controladora das ações correspondentes às salas
 *
 */

@Transactional
@Controller
@RequestMapping(value = "/sala/*")
public class SalaController {
	
	@Autowired
	private AlunoDao alunoDao;
	
	@Autowired
	private SalaDao salaDao;
	
	@RequestMapping(value = "/lista")
	public String recuperaTodasAsSalas(Model model) {
		model.addAttribute("salas", salaDao.getAll());
		return "salas/lista-salas";
	}
	
	@RequestMapping(value = "/nova"	)
	public String form() {
		return "salas/nova-sala";
	}
	
	@RequestMapping(value = "/cadastrar")
	public String cadastrarSala(@Valid Sala sala, BindingResult result) {
		if (!result.hasErrors()) {
			salaDao.salvar(sala);
			return "redirect:lista";
		} else {
			return "/salas/nova-sala";
		}
	}
	
	/**
	 * 
	 * @param id
	 * @param model
	 * @return Alunos de uma determinada sala
	 */
	@RequestMapping(value = "/alunos")
	public String recuperaAlunosDaSala(Integer id, Model model) {
		List<Aluno> alunos = alunoDao.findAlunoByIdSala(id);
		model.addAttribute("alunos", alunos);
		Sala sala = salaDao.findSalaById(id);
		model.addAttribute("sala", sala);
		return "salas/alunos-da-sala";
	}

	
}
