package com.salesforce.fs.domain;

public class Quit extends Comando {

  @Override
  public void correrComando() throws Exception {
    System.exit(0);
  }

}
