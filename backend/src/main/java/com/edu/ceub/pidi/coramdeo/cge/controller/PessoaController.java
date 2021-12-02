package com.edu.ceub.pidi.coramdeo.cge.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.edu.ceub.pidi.coramdeo.cge.models.Eventos;
import com.edu.ceub.pidi.coramdeo.cge.models.Pessoa;
import com.edu.ceub.pidi.coramdeo.cge.repository.PessoaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Api(value = "API REST Pessoas")
@EnableSwagger2
@RestController
public class PessoaController {

	@Autowired
	PessoaRepository pr;
	
	@RequestMapping("/Pessoas")
	@ApiOperation(value = "Retorna uma lista de Pessoas")
	@GetMapping(produces = "application/json")
	public @ResponseBody ModelAndView listaPessoas() {
		ModelAndView mv = new ModelAndView("cge/ListaPessoas");
		Iterable<Pessoa> pessoa = pr.findAll();
		mv.addObject("pessoa", pessoa);
		return mv;
	}

	@ApiOperation(value = "Retorna um form de cadastro de pessoa")	
	@RequestMapping(value = "/PessoaCadastro", method = RequestMethod.GET )
	@GetMapping(produces = "application/json")
	public @ResponseBody ModelAndView FormPessoas() {
		ModelAndView mv = new ModelAndView("cge/FormPessoas");
		return mv;
	}
	
	@RequestMapping(value = "/PessoaCadastro", method = RequestMethod.POST )
	@PostMapping()
	public String FormPessoas( @Valid Pessoa pessoa) {
		pr.save(pessoa);
		return "redirect:/eventos";
	}
	@ApiOperation(value = "Deleta uma pessoa")
	@RequestMapping("/deletarpessoa")
	@DeleteMapping
	public String DeletarPessoa(Integer id) {
		pr.deleteById(id);	
		return "redirect:/eventos";
	}

}
