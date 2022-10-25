package com.mibanco.cliente.repositories;

import com.mibanco.cliente.models.Cuenta;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends CrudRepository<Cuenta,Long> {
 public abstract ArrayList<Cuenta> findByPrioridad(Integer prioridad);
}
