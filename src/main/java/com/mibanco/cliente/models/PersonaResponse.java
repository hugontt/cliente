package com.mibanco.cliente.models;

public class PersonaResponse {

  private String nombres;
  private String direccion;
  private String telefono;
  private int contrasena;
  private boolean estado;

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public int getContrasena() {
    return contrasena;
  }

  public void setContrasena(int contrasena) {
    this.contrasena = contrasena;
  }

  public boolean isEstado() {
    return estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }
}
