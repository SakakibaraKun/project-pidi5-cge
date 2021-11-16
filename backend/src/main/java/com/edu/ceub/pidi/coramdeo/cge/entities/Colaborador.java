package com.edu.ceub.pidi.coramdeo.cge.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_colaborador")
public class Colaborador extends Pessoa{

	private Float valor_contribuicao;

	@ManyToOne
	@JoinColumn(name="pessoa_cpf")
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name = "cargo_id")
	private Cargo cargo;
	
	public Colaborador() {
	}
	
	public Float getValor_contribuicao() {
		return valor_contribuicao;
	}

	public void setValor_contribuicao(Float valor_contricuicao) {
		this.valor_contribuicao = valor_contricuicao;
	}
	
	
}
