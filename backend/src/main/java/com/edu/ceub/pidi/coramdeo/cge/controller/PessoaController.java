package com.edu.ceub.pidi.coramdeo.cge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.edu.ceub.pidi.coramdeo.cge.models.Pessoa;
import com.edu.ceub.pidi.coramdeo.cge.repository.PessoaRepository;

@RestController
public class PessoaController {

	@Autowired
	PessoaRepository pr;

	@RequestMapping("/PessoaCadastro")
	@GetMapping(produces = "application/json")
	public @ResponseBody ModelAndView FormPessoas() {
		ModelAndView mv = new ModelAndView("cge/FormPessoas");
		return mv;
	}

}
