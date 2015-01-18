package br.com.lucas.escola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author fauker
 * Classe que fará a representação da base do sistema.
 *
 */

@Controller
public class BaseController {

	/**
	 * 
	 * @return String home
	 */
	@RequestMapping(value = "/home")
	public String form() {
		return "home";
	}
	
	//TODO method logout
	
}
