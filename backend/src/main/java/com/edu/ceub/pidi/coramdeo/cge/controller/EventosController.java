package com.edu.ceub.pidi.coramdeo.cge.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.edu.ceub.pidi.coramdeo.cge.models.Eventos;
import com.edu.ceub.pidi.coramdeo.cge.repository.EventoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST eventos")
@RestController
@RequestMapping("/eventos")
public class EventosController {
	
		@Autowired
		private EventoRepository er;
		
		
		@ApiOperation(value = "Retorna uma lista de eventos")
		@GetMapping(produces = "application/json")
		public @ResponseBody ModelAndView listaEventos() {
			ModelAndView mv = new ModelAndView("ListaEventos");
			Iterable<Eventos> listaEventos = er.findAll();
			mv.addObject("evento", listaEventos);
			return mv;
		}
		
		
		@ApiOperation(value = "Salva um Evento")
		@RequestMapping(value = "/eventos/cadastrar", method = RequestMethod.POST )
		@PostMapping()
		public String formEvento(@RequestBody @Valid Eventos eventos) {
			return "redirect:/eventos";
		}
		
//		@ApiOperation(value = "Deleta um evento")
//		@DeleteMapping()
//		public Eventos DeletarEventos(@RequestBody Eventos eventos) {
//			er.delete(eventos);
//			return eventos;
//			
//		}
		@ApiOperation(value = "Deleta um evento")
		@RequestMapping("/deletarEvento")
		public String DeletarEvento(Integer id) {
			er.deleteById(id);
			return "redirect:/eventos";
		}
		
		
		
		
//		public ModelAndView listaEventos() {
//			ModelAndView mv = new ModelAndView("index");
//			Iterable<Eventos> eventos = er.findAll();
//			mv.addObject("evento", eventos );
//			return mv;
//		}
}
