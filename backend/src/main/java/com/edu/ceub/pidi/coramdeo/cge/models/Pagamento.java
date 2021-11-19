package com.edu.ceub.pidi.coramdeo.cge.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pagamento;
	private Date dt_pagamento;
	private Float valor;
	private String forma_pagamento;
	
	@ManyToOne
	@JoinColumn(name="fk_eventos")
	private Eventos eventos;

	public Pagamento() {
	}

	public Pagamento(Integer id_pagamento, Date dt_pagamento, Float valor, String forma_pagamento, Eventos eventos) {
		this.id_pagamento = id_pagamento;
		this.dt_pagamento = dt_pagamento;
		this.valor = valor;
		this.forma_pagamento = forma_pagamento;
		this.eventos = eventos;
	}

	public Integer getId_pagamento() {
		return id_pagamento;
	}

	public void setId_pagamento(Integer id_pagamento) {
		this.id_pagamento = id_pagamento;
	}

	public Date getDt_pagamento() {
		return dt_pagamento;
	}

	public void setDt_pagamento(Date dt_pagamento) {
		this.dt_pagamento = dt_pagamento;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public Eventos getEventos() {
		return eventos;
	}

	public void setEventos(Eventos eventos) {
		this.eventos = eventos;
	}
	
	
}
