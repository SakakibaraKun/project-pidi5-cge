package com.edu.ceub.pidi.coramdeo.cge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ceub.pidi.coramdeo.cge.models.Candidato;
import com.edu.ceub.pidi.coramdeo.cge.models.Eventos;

public interface CandidatoRepository extends JpaRepository<Candidato, Integer>{
//	Iterable<Candidato> findByEvento(Eventos eventos);
//
//	Candidato findByCpf(String cpf);

}
