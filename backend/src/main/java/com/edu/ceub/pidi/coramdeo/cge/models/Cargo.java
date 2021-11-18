package com.edu.ceub.pidi.coramdeo.cge.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
public class Cargo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome_cargo;
	private Byte hierarquia;
	private String descricao_cargo;
	private String perfil_apropiado;
	
	//private List<Colaborador> colaborador;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome_cargo() {
		return nome_cargo;
	}

	public void setNome_cargo(String nome_cargo) {
		this.nome_cargo = nome_cargo;
	}

	public Byte getHierarquia() {
		return hierarquia;
	}

	public void setHierarquia(Byte hierarquia) {
		this.hierarquia = hierarquia;
	}

	public String getDescricao_cargo() {
		return descricao_cargo;
	}

	public void setDescricao_cargo(String descricao_cargo) {
		this.descricao_cargo = descricao_cargo;
	}

	public String getPerfil_apropiado() {
		return perfil_apropiado;
	}

	public void setPerfil_apropiado(String perfil_apropiado) {
		this.perfil_apropiado = perfil_apropiado;
	}
	
	
}
