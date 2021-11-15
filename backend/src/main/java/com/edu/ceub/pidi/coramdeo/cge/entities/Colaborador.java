package com.edu.ceub.pidi.coramdeo.cge.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_colaborador")
public class Colaborador extends Pessoa{

	private Float valor_contricuicao;

	@ManyToOne
	@JoinColumn(name="pessoa_cpf")
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name = "cargo_id")
	private Cargo cargo;
	
	public Colaborador() {
	}

	public Float getValor_contricuicao() {
		return valor_contricuicao;
	}

	public void setValor_contricuicao(Float valor_contricuicao) {
		this.valor_contricuicao = valor_contricuicao;
	}
	
	
}
