package com.mibanco.cliente.services;

import com.mibanco.cliente.models.Cliente;
import com.mibanco.cliente.repositories.ClienteRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
  @Autowired
  ClienteRepository clienteRepository;

  public ArrayList<Cliente> obtenerClientes(){
    return (ArrayList<Cliente>) clienteRepository.findAll();
  }

  public Cliente guardarCliente(Cliente usuario){
    return clienteRepository.save(usuario);
  }

  public Optional<Cliente> obtenerPorId(Long id){
    return clienteRepository.findById(id);
  }


  public ArrayList<Cliente>  obtenerPorPrioridad(Integer prioridad) {
    return clienteRepository.findByPrioridad(prioridad);
  }

  public boolean eliminarCliente(Long id) {
    try{
      clienteRepository.deleteById(id);
      return true;
    }catch(Exception err){
      return false;
    }
  }
}
