package br.com.lucas.escola.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Lucas Moreira
 * Controlador para acessos a URL genéricas do sistema.
 */

@Controller
public class AppController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(HttpSession session) {
        return "home";
    }
	
	@RequestMapping(value = "/index")
	public String index() {
			return "index";
	}
	
}
