package com.edu.ceub.pidi.coramdeo.cge.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.edu.ceub.pidi.coramdeo.cge.models.Candidato;
import com.edu.ceub.pidi.coramdeo.cge.models.Eventos;
import com.edu.ceub.pidi.coramdeo.cge.repository.CandidatoRepository;
import com.edu.ceub.pidi.coramdeo.cge.repository.EventoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Api(value = "API REST eventos")
@EnableSwagger2
@RestController
public class EventosController {
	
		@Autowired
		private EventoRepository er;
		@Autowired 
		private CandidatoRepository cr;
		
		@RequestMapping("/eventos")
		@ApiOperation(value = "Retorna uma lista de eventos")
		@GetMapping(produces = "application/json")
		public @ResponseBody ModelAndView listaEventos() {
			ModelAndView mv = new ModelAndView("cge/ListaEventos");
			Iterable<Eventos> listaEventos = er.findAll();
			mv.addObject("evento", listaEventos);
			return mv;
		}
		@ApiOperation(value = "mostra form do evento")
		@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET )
		@GetMapping(produces = "application.json")
		public ModelAndView formEvento() {
			ModelAndView mv = new ModelAndView("cge/FormEvento");
			return mv;
		}
		
		
		@ApiOperation(value = "Salva um Evento")
		@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST )
		@PostMapping()
		public String formEvento( @Valid Eventos eventos) {
			er.save(eventos);
			return "redirect:/eventos";
		}
		
		@ApiOperation(value = "Deleta um evento")
		@RequestMapping("/deletarEvento")
		@DeleteMapping
		public String DeletarEvento(Integer id) {
			er.deleteById(id);
			
			return "<h1>Deletado com sucesso</br></h1><a href=\"/eventos\"><h2>Lista de Eventos</h2></a>";
		}
		
		
//		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//		public @ResponseBody ModelAndView detalheEvento(@PathVariable("id") int id) {
//			Eventos evento = er.findByid(id);
//			ModelAndView mv = new ModelAndView("evento/detalhesEvento");
//			mv.addObject("evento", evento);
//			Iterable<Candidato> candidatos = cr.findByEvento(evento);
//			mv.addObject("candidatos", candidatos);
//			return mv;
//		}
		
//		@RequestMapping(value="/{cpf}", method=RequestMethod.POST)
//		public String detalhesEventoPost(@PathVariable("codigo") Integer cpf, @Valid Candidato candidato){			
//			Eventos evento = er.findByid(cpf);
//			candidato.setEvento(evento);
//			cr.save(candidato);
//			return "redirect:/{codigo}";
//		}
}
