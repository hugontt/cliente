package com.mibanco.cliente.repositories;

import com.mibanco.cliente.models.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {
 Persona findPersonasById(String id);
}
