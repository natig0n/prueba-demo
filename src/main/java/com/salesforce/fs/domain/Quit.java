package com.salesforce.fs.domain;

import com.salesforce.fs.Constantes;

public class Quit extends Comando {

  public Quit(String cmd) {
    super.setNombre(cmd);
  }

  @Override
  public void correrComando() throws Exception {
    System.exit(0);
    System.out.println(Constantes.PRUEBA);
  }

}
