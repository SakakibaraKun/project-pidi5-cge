package com.edu.ceub.pidi.coramdeo.cge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.ceub.pidi.coramdeo.cge.models.Pessoa;
import com.edu.ceub.pidi.coramdeo.cge.repository.PessoaRepository;

@RestController
public class PessoaController {
	
	
	 @Autowired 
	 PessoaRepository pessoarepository;
	 
	 @RequestMapping("/pessoas") 
	 public List<Pessoa> PessoasLista(){ 
	 List<Pessoa> pessoa = pessoarepository.findAll(); 
	 return pessoa; 
	 }

	
}
