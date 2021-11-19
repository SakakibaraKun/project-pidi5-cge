package com.edu.ceub.pidi.coramdeo.cge.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;


@Entity
@PrimaryKeyJoinColumn(name = "cpf")
public class Colaborador extends Pessoa{

	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName="id_cpf",insertable=false,updatable=false)
    @Cascade(CascadeType.ALL)
	@Fetch(org.hibernate.annotations.FetchMode.JOIN)
	private Pessoa pessoa;

	@ManyToOne
	@MapsId
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
