package com.edu.ceub.pidi.coramdeo.cge.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edu.ceub.pidi.coramdeo.cge.models.Candidato;
import com.edu.ceub.pidi.coramdeo.cge.models.Eventos;
import com.edu.ceub.pidi.coramdeo.cge.models.Pessoa;
import com.edu.ceub.pidi.coramdeo.cge.repository.CandidatoRepository;
import com.edu.ceub.pidi.coramdeo.cge.repository.EventoRepository;
import com.edu.ceub.pidi.coramdeo.cge.repository.PessoaRepository;

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
		@Autowired
		private PessoaRepository pr;
		
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
			
			return "redirect:/eventos";
		}
		
//		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//		public ModelAndView detalheEvento(@PathVariable("id") Integer id) {
//			Eventos evento = er.findById(id);
//			ModelAndView mv = new ModelAndView("evento/detalhesEvento");
//			mv.addObject("evento", evento);
//			Iterable<Pessoas> pessoas = pr.findByEvento(evento);
//			mv.addObject("convidados", convidados);
//			return mv;
//		}
//		@RequestMapping(value="/{codigo}", method=RequestMethod.POST)
//		public String detalhesEventoPost(@PathVariable("codigo") long codigo, @Valid Pessoa pessoa,  BindingResult result, RedirectAttributes attributes){
//			if(result.hasErrors()){
//				attributes.addFlashAttribute("mensagem", "Verifique os campos!");
//				return "redirect:/{codigo}";
//			}
//			Eventos evento = er.findById(id);
//			pessoa.setEvento(evento);
//			cr.save(pessoa);
//			attributes.addFlashAttribute("mensagem", "Convidado adicionado com sucesso!");
//			return "redirect:/{codigo}";
//		}
		
}
