package com.edu.ceub.pidi.coramdeo.cge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.ceub.pidi.coramdeo.cge.models.Colaborador;
import com.edu.ceub.pidi.coramdeo.cge.repository.ColaboradorRepository;

@RestController
public class ColaboradorController {

	@Autowired
	ColaboradorRepository colaboradorrepository;
	
	
	@RequestMapping("/colaboradores")
	public List<Colaborador> ListaColaboradoresFull(){
		List<Colaborador> colaborador = colaboradorrepository.findAll();
		return colaborador;
	}
}
