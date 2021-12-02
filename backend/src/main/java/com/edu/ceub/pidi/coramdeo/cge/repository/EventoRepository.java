package com.edu.ceub.pidi.coramdeo.cge.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.edu.ceub.pidi.coramdeo.cge.models.Eventos;

public interface EventoRepository extends CrudRepository<Eventos, Integer>{



	
}
