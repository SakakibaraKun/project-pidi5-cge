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
import com.edu.ceub.pidi.coramdeo.cge.models.Cargo;
import com.edu.ceub.pidi.coramdeo.cge.repository.CargoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Api(value = "API REST Cargos")
@EnableSwagger2
@RestController
public class CargoController {

	@Autowired
	CargoRepository cr;
	
	@RequestMapping("/Cargos")
	@ApiOperation(value = "Retorna uma lista de Cargos")
	@GetMapping(produces = "application/json")
	public @ResponseBody ModelAndView listaCargos() {
		ModelAndView mv = new ModelAndView("cge/ListaCargo");
		Iterable<Cargo> cargo = cr.findAll();
		mv.addObject("cargo", cargo);
		return mv;
	}

	@ApiOperation(value = "Retorna um form de cadastro de Cargos")	
	@RequestMapping(value = "/CargoCadastro", method = RequestMethod.GET )
	@GetMapping(produces = "application/json")
	public @ResponseBody ModelAndView FormCargo() {
		ModelAndView mv = new ModelAndView("cge/FormCargo");
		return mv;
	}
	
	@RequestMapping(value = "/CargoCadastro", method = RequestMethod.POST )
	@PostMapping()
	public String FormCargo( @Valid Cargo cargo) {
		cr.save(cargo);
		return "redirect:/Cargos";
	}
	@ApiOperation(value = "Deleta um Cargo")
	@RequestMapping("/deletarCargo")
	@DeleteMapping
	public String DeletarCargo(Integer id) {
		cr.deleteById(id);	
		return "redirect:/Cargos";
	}
}
