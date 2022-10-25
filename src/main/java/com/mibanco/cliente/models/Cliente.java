package com.mibanco.cliente.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cliente extends Persona{
// clienteid, contraseña, estado
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "clienteid")
  private Long clienteid;

  @Column(name = "contrasena")
  private String contrasena;
  @Column(name = "estado")
  private boolean estado;

  public Long getClienteid() {
    return clienteid;
  }

  public void setClienteid(Long clienteid) {
    this.clienteid = clienteid;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  public boolean isEstado() {
    return estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }
}
