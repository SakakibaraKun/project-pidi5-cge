package com.edu.ceub.pidi.coramdeo.cge.entities;

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
@Table(name="tb_eventos")
public class Eventos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date dt_evento;
	private String nome_evento;
	
	@OneToMany(mappedBy = "eventos")
	private List<Pessoa> pessoas = new ArrayList<>();
	
	@OneToMany(mappedBy = "eventos")
	private List<Pagamento> pagamentos = new ArrayList<>();
	
	public Eventos() {
	}

	public Eventos(Integer id, Date dt_evento, String nome_evento, List<Pessoa> pessoas, List<Pagamento> pagamentos) {
		this.id = id;
		this.dt_evento = dt_evento;
		this.nome_evento = nome_evento;
		this.pessoas = pessoas;
		this.pagamentos = pagamentos;
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

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	
	
		
}
