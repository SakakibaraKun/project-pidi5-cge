package com.edu.ceub.pidi.coramdeo.cge.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Eventos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date dt_evento;
	private String nome_evento;
	
	
	
	public Eventos() {
	}

	public Eventos(Integer id, Date dt_evento, String nome_evento, List<Pessoa> pessoas, List<Pagamento> pagamentos) {
		this.id = id;
		this.dt_evento = dt_evento;
		this.nome_evento = nome_evento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDt_evento() {
		return dt_evento;
	}

	public void setDt_evento(Date dt_evento) {
		this.dt_evento = dt_evento;
	}

	public String getNome_evento() {
		return nome_evento;
	}

	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}


	
	
		
}
