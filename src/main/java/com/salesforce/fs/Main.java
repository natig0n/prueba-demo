package com.salesforce.fs;

import com.salesforce.fs.service.impl.ComandoServiceImpl;

public class Main {

  public static void main(String[] args) throws Exception {
    System.out.println(Constantes.TITULO);
    try {
      String comandoIngresado = args[0];
      if (comandoIngresado == null) {
        ComandoServiceImpl.mostrarMensajeError();
      } else {
        ComandoServiceImpl.ejecutarComandoIngresado(comandoIngresado);
      }
    } catch (Exception e) {
      System.out.println(Constantes.ERROR);
    }
  }
}
