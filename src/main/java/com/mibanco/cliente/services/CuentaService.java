package com.mibanco.cliente.services;

import com.mibanco.cliente.models.Cuenta;
import com.mibanco.cliente.repositories.CuentaRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaService {
  @Autowired
  CuentaRepository cuentaRepository;

  public ArrayList<Cuenta> obtenerCuentas(){
    return (ArrayList<Cuenta>) cuentaRepository.findAll();
  }

  public Cuenta guardarCuenta(Cuenta cuenta){
    return cuentaRepository.save(cuenta);
  }

  public Optional<Cuenta> obtenerPorId(Long id){
    return cuentaRepository.findById(id);
  }


  public ArrayList<Cuenta>  obtenerPorPrioridad(Integer prioridad) {
    return cuentaRepository.findByPrioridad(prioridad);
  }

  public boolean eliminarCuenta(Long id) {
    try{
      cuentaRepository.deleteById(id);
      return true;
    }catch(Exception err){
      return false;
    }
  }
}
