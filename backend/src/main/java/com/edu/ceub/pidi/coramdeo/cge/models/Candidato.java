package com.edu.ceub.pidi.coramdeo.cge.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Candidato extends Pessoa{

@OneToOne
private Pessoa pessoa;



	 
}
