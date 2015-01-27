package br.com.lucas.escola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/curso/**")
@Transactional
public class CursoController {

}
