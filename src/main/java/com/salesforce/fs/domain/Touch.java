package com.salesforce.fs.domain;

public class Touch extends Comando {

  public Touch(String cmd) {
    super.setNombre(cmd);
  }

  @Override
  public void correrComando() throws Exception {

  }
}
