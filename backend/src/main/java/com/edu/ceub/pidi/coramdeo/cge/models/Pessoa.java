package com.edu.ceub.pidi.coramdeo.cge.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Pessoa {

	//verificar anotation para usar cpf como PK
	@Id
	private String cpf;
	private String Nome;
	private Date dt_nasc;
	private String telefone;
	private String email;
	private String cep;
	private String endereco;
	private String uf;
	private Float valor;
	private Float valor_contribuicao;
	
	
	
	public Pessoa() {
	}
	
	

	public Pessoa(String cpf, String nome, Date dt_nasc, String telefone, String email, String cep, String endereco,
			String uf, Float valor, Float valor_contribuicao) {
		this.cpf = cpf;
		Nome = nome;
		this.dt_nasc = dt_nasc;
		this.telefone = telefone;
		this.email = email;
		this.cep = cep;
		this.endereco = endereco;
		this.uf = uf;
		this.valor = valor;
		this.valor_contribuicao = valor_contribuicao;
	}



	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
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

	public Float getValor_contribuicao() {
		return valor_contribuicao;
	}

	public void setValor_contribuicao(Float valor_contribuicao) {
		this.valor_contribuicao = valor_contribuicao;
	}
	
	
}
