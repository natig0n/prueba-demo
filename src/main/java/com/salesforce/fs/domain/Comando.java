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

  public void ejecutar() {
    try {
      System.out.println(Constantes.EJECUTO + this.getNombre());
      correrComando();
    } catch (Exception e) {
      System.out.println(Constantes.ERROR + this.getNombre());
    }
  }

  public abstract void correrComando() throws Exception;

}
