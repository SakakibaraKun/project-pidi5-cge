package com.edu.ceub.pidi.coramdeo.cge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.ceub.pidi.coramdeo.cge.models.Eventos;
import com.edu.ceub.pidi.coramdeo.cge.repository.EventoRepository;

@RestController
public class EventosController {
	
		@Autowired
		EventoRepository eventorepository;
		
		@RequestMapping("/eventos")
		public List<Eventos> EventoListaFull(){
			List<Eventos> evento = eventorepository.findAll();
			return evento;
		}
}
