package com.salesforce.fs.domain;

public class Pwd extends Comando {

  public Pwd(String cmd) {
    super.setNombre(cmd);
  }

  @Override
  public void correrComando() throws Exception {
    String path = Pwd.class.getCanonicalName();
    System.out.println(path);
  }

}
