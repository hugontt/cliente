package com.mibanco.cliente.controller;


import com.mibanco.cliente.models.Cliente;
import com.mibanco.cliente.models.Persona;
import com.mibanco.cliente.models.PersonaResponse;
import com.mibanco.cliente.repositories.PersonaRepository;
import com.mibanco.cliente.services.ClienteService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clientes")
public class MovimientosController {
  @Autowired

  ClienteService clienteService;

  PersonaResponse personaResponse;
  Optional<Persona> persona;
  PersonaRepository personaRepository;

public MovimientosController(PersonaRepository personaRepository){
this.personaRepository = personaRepository;
}
/*
@GetMapping(path ="/cliente/{id}")
public ResponseEntity<PersonaResponse> getCustomer(@PathVariable("id") String id){
  persona = Optional.of(new Persona());
  personaResponse = new PersonaResponse();
  persona = Optional.ofNullable(personaRepository.findPersonasById(id));

  if (persona.isPresent()) {

    personaResponse.setNombres(persona.get().getNombre());
    personaResponse.setDireccion(persona.get().getDireccion());
  //  personaResponse.setTelefono(persona.getTelefono());

  }
  return ResponseEntity.ok(personaResponse);

}*/

  @GetMapping( path = "/{id}")
  public Optional<Cliente> obtenerClientePorId(@PathVariable("id") Long id) {
    return this.clienteService.obtenerPorId(id);
  }

  @GetMapping("/query")
  public ArrayList<Cliente> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
    return this.clienteService.obtenerPorPrioridad(prioridad);
  }

  @DeleteMapping( path = "/{id}")
  public String eliminarPorId(@PathVariable("id") Long id){

    Cliente cliente = new Cliente();

    boolean ok = this.clienteService.eliminarCliente(id);
    if (ok){
      return "Se elimin?? el usuario con id " + id;
    }else{
      return "No pudo eliminar el usuario con id" + id;
    }
  }
  @GetMapping()
  public ArrayList<Cliente> obtenerClientes(){
    return clienteService.obtenerClientes();
  }

  @PostMapping()
  public Cliente guardarCliente(@RequestBody Cliente cliente){
    return this.clienteService.guardarCliente(cliente);
  }

}
