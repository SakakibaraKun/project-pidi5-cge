package com.edu.ceub.pidi.coramdeo.cge.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tb_candidato")
public class Candidato extends Pessoa{


	private Float valor_participacao;
	
	@ManyToOne
	@JoinColumn(name="pessoa_cpf")
	private Pessoa pessoa;
	
	public Candidato(){
	}

	public Float getValor_participacao() {
		return valor_participacao;
	}

	public void setValor_participacao(Float valor_participacao) {
		this.valor_participacao = valor_participacao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
