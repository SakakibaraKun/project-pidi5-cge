package com.edu.ceub.pidi.coramdeo.cge.models;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
public class Eventos implements Serializable{
	

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@NotEmpty
	@NotBlank
	private String Dt_evento;
	@NotBlank
	private String Nome_evento;
	
	@OneToMany
	@JoinColumn(name = "fk_pessoa") 
	private List<Pessoa> pessoa;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getDt_evento() {
		return Dt_evento;
	}
	public void setDt_evento(String dt_evento) {
		
		Dt_evento = dt_evento;
	}
	public String getNome_evento() {
		return Nome_evento;
	}
	public void setNome_evento(String nome_evento) {
		Nome_evento = nome_evento;
	}
//	java.util.Date dt = new java.util.Date();
//
//	java.text.SimpleDateFormat sdf = 
//	     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//	String currentTime = sdf.format(dt);
	
//	@OneToMany
//	@JoinColumn(name = "fk_pagamento") 
//	private List<Pagamento> pagamento;
//	
//	@OneToMany
//	@JoinColumn(name = "fk_pessoa") 
//	private List<Pessoa> pessoa;

	


}
