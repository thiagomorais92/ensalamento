package br.com.lucas.escola.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lucas.escola.model.Funcionario;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Controller
@RequestMapping(value = "/funcionario/**")
public class FuncionarioController {

	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	public String novo(Model model) {
		return "funcionario/cadastrar-funcionario";
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.GET)
	public String save(@Valid Funcionario funcionaro) {
		return null;
	}
	
}
