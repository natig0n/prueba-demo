package com.salesforce.fs.domain;

import com.salesforce.fs.Constantes;

public abstract class Comando {

  private String nombre;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void ejecutar() throws Exception {
    try {
      System.out.println(Constantes.EJECUTO + this.getNombre());
      correrComando();
    } catch (Exception e) {
      throw new Exception(Constantes.ERROR + this.getNombre());
    }
  }

  public abstract void correrComando() throws Exception;

}
