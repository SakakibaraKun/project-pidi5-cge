package com.edu.ceub.pidi.coramdeo.cge.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Candidato extends Pessoa{

	 @ManyToOne
	 @JoinColumn(name = "fk_pessoa")
	 private Pessoa pessoa;
	 
}
