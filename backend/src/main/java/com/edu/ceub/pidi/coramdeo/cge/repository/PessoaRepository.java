package com.edu.ceub.pidi.coramdeo.cge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ceub.pidi.coramdeo.cge.models.Eventos;
import com.edu.ceub.pidi.coramdeo.cge.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
//	Iterable<Pessoa> findByEvento(Eventos evento);
//	Pessoa findBycpf(String cpf);

}
