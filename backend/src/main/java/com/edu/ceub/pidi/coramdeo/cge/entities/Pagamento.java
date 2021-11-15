package com.edu.ceub.pidi.coramdeo.cge.entities;

import java.util.Date;

public class Pagamento {
	
	private Integer id_pagamento;
	private Date dt_pagamento;
	private Float valor;
	private String forma_pagamento;
	
	public Pagamento() {

	}

	public Pagamento(Integer id_pagamento, Date dt_pagamento, Float valor, String forma_pagamento) {
		super();
		this.id_pagamento = id_pagamento;
		this.dt_pagamento = dt_pagamento;
		this.valor = valor;
		this.forma_pagamento = forma_pagamento;
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
	
	
}
