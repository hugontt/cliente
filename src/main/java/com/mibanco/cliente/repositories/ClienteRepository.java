package com.mibanco.cliente.repositories;

import com.mibanco.cliente.models.Cliente;
import com.mibanco.cliente.models.Persona;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long> {
 public abstract ArrayList<Cliente> findByPrioridad(Integer prioridad);
}
