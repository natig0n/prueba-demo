package com.salesforce.fs.domain;

public class Cd extends Comando {

  public Cd(String cmd) {
    super.setNombre(cmd);
  }

  @Override
  public void correrComando() throws Exception {
    String path = Pwd.class.getCanonicalName();
    System.out.println(path);
  }

}
