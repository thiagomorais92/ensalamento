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
import org.springframework.web.servlet.ModelAndView;

import br.com.lucas.escola.dao.AlunoDao;
import br.com.lucas.escola.dao.SalaDao;
import br.com.lucas.escola.model.Aluno;
import br.com.lucas.escola.model.Turma;

/**
 * 
 * @author Lucas Moreira
 * Classe responsável por controlar as ações dos alunos
 *
 */

@Transactional
@Controller
@RequestMapping(value = "/aluno/*")
public class AlunoController {

	@Autowired
	private AlunoDao alunoDao;
	
	@Autowired
	private SalaDao salaDao;
	
	
	/**
	 * 
	 * @param aluno
	 * @return redirect to Lista de Salas Cadastradas
	 */
	@RequestMapping(value ="/cadastrar", method = RequestMethod.POST)
	public String adicionaAluno(@Valid Aluno aluno, BindingResult result) {
		if (result.hasErrors()) {
			return "aluno/cadastrar-aluno";
		} else {
			Integer id = aluno.getId();
			if (id == 0 || id == null) {
				alunoDao.salvar(aluno); 
			} else {
				alunoDao.atualizar(aluno);
			}
			return "home";	
		}
	}
	
	/**
	 * 
	 * @param aluno
	 * @return lista de alunos cadastrados
	 */
	@RequestMapping(value="/excluir", method = RequestMethod.GET)
	public String excluirAluno(Aluno aluno) {
		Aluno alunoASerExcluido = alunoDao.findAlunoById(aluno.getId());
		alunoDao.excluir(alunoASerExcluido);
		return "aluno/lista-alunos";
	}
	
	/**
	 * 
	 * @return página de cadastrar um novo aluno
	 */
	@RequestMapping(value="/novo", method = RequestMethod.GET)
	public String form() {
		return "aluno/cadastrar-aluno";
	}
	
	
	/**
	 * 
	 * @param aluno
	 * @param numSala
	 * @param model
	 * @return tela de pesquisa de alunos por nome
	 */
	@RequestMapping(value = "/procurar", method = RequestMethod.POST)
	public String procurarAlunosNaoEnsalados(Aluno aluno, Integer numSala, Model model) {
		List<Aluno> alunos = alunoDao.getAlunosNaoEnsaladosByNome(aluno.getNome());
		Turma sala = salaDao.findSalaById(numSala);
		model.addAttribute("alunos", alunos);
		model.addAttribute("sala", sala);
		return "aluno/procurar-alunos";
	}	
	
	/**
	 * 
	 * @param numSala
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/nao-ensalados")
	public String formProcuraAlunos(Integer numSala, Model model) {
		Turma sala = salaDao.findSalaById(numSala);
		model.addAttribute("sala", sala);
		return "aluno/procurar-alunos";
	}
	
	
	/**
	 * 
	 * @param idSala
	 * @param idAluno
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/adicionar")
	public ModelAndView adicionaAlunoNaSala(Integer idSala, Integer idAluno, Model model) {
		Aluno aluno = alunoDao.findAlunoById(idAluno);
		
		aluno.setSala(salaDao.findSalaById(idSala));
		alunoDao.salvar(aluno);
		
		ModelAndView modelAndView = new ModelAndView("salas/alunos-da-sala");
		modelAndView.addObject("alunos", alunoDao.findAlunosByIdSala(idSala));
		modelAndView.addObject("sala", salaDao.findSalaById(idSala));
		return modelAndView;
	}
	
	/**
	 * 
	 * @param idAluno
	 * @param idSala
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/remover")
	public ModelAndView removerAluno(Integer idAluno, Integer idSala, Model model) {
		Aluno alunoASerRemovidoDaSala = alunoDao.findAlunoById(idAluno);
		alunoASerRemovidoDaSala.setSala(null);
		alunoDao.atualizar(alunoASerRemovidoDaSala);
		
		ModelAndView mv = new ModelAndView("salas/alunos-da-sala");
		mv.addObject("alunos", alunoDao.findAlunosByIdSala(idSala));
		mv.addObject("sala", salaDao.findSalaById(idSala));
		return mv;
	}
	
}
