package com.salesforce.fs.domain;

public class Quit extends Comando {

  public Quit(String cmd) {
    super.setNombre(cmd);
  }

  @Override
  public void correrComando() throws Exception {
    System.exit(0);
  }

}
