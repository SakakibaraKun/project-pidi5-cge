package com.edu.ceub.pidi.coramdeo.cge.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Colaborador extends Pessoa{

	
	@ManyToOne
	@JoinColumn(name = "fk_pessoa")
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "fk_cargo")
	private Cargo cargo;
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	
	
	
}
