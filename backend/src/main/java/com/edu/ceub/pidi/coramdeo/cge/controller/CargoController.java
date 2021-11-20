package com.edu.ceub.pidi.coramdeo.cge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.ceub.pidi.coramdeo.cge.models.Cargo;
import com.edu.ceub.pidi.coramdeo.cge.repository.CargoRepository;

@RestController
public class CargoController {

	@Autowired
	CargoRepository cargorepository;
	
	@RequestMapping("/cargos")
	public List<Cargo> ListagemCargos(){
		List<Cargo> cargo = cargorepository.findAll();
		return cargo;
	}
}
