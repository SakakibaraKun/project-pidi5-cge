package com.edu.ceub.pidi.coramdeo.cge.entities;

import java.util.Date;

public class Eventos {
	private Date dt_evento;
	private String nome_evento;
	
	public Eventos() {
	}

	public Eventos(Date dt_evento, String nome_evento) {
		super();
		this.dt_evento = dt_evento;
		this.nome_evento = nome_evento;
	}

	public Date getDt_evento() {
		return dt_evento;
	}

	public void setDt_evento(Date dt_evento) {
		this.dt_evento = dt_evento;
	}

	public String getNome_evento() {
		return nome_evento;
	}

	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}
	
	
}
