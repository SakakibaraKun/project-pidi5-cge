package com.edu.ceub.pidi.coramdeo.cge.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {

	@Id
	@Column(name = "id_cpf", unique = true)
	@NotEmpty
	@NotBlank
	private Long cpf;
	@NotBlank
	private String Nome;
	@NotBlank
	private Date dt_nasc;
	@NotBlank
	private String telefone;
	@NotBlank
	private String email;
	@NotBlank
	private String cep;
	@NotBlank
	private String endereco;
	@NotBlank
	private String uf;
	@NotBlank
	private Float valor;
	
	@ManyToOne
	private Eventos eventos;
	
	@OneToOne
	private Candidato candidato;

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Date getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(Date dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
	
}
