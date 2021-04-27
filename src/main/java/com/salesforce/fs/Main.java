package com.salesforce.fs;

import com.salesforce.fs.domain.Comando;
import com.salesforce.fs.service.impl.ComandoServiceImpl;

public class Main {

  public static void main(String comandoIngresado) throws Exception {
    try {
      Comando cmd = FactoriaComando.getComandoIngresado(comandoIngresado);
      if (cmd == null) {
        ComandoServiceImpl.mostrarMensajeError();
      } else {
        cmd.ejecutar();
      }
    } catch (Exception e) {
      throw new Exception();
    }
  }
}
