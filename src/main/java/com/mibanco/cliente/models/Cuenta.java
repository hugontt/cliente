package com.mibanco.cliente.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cuenta {
//Numero Cuenta 	Tipo 	Saldo-Inicial 	Estado 	Cliente

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "numerocta")
  private String numerocta;
  @Column(name = "tipo")
  private String tipo;
  @Column(name = "saldoInicial")
  private String saldoInicial;
  @Column(name = "estado")
  private String estado;
  @Column(name = "cliente")
  private String cliente;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumerocta() {
    return numerocta;
  }

  public void setNumerocta(String numerocta) {
    this.numerocta = numerocta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getSaldoInicial() {
    return saldoInicial;
  }

  public void setSaldoInicial(String saldoInicial) {
    this.saldoInicial = saldoInicial;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }
}
