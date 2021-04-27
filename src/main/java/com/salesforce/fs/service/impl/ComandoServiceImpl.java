package com.salesforce.fs.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.salesforce.fs.Constantes;

public class ComandoServiceImpl {

  public static List<String> comandosValidos = new ArrayList<String>();

  public void cargarComandosValidos() {
    comandosValidos.add(Constantes.CMD_QUIT);
    comandosValidos.add(Constantes.CMD_PWD);
    comandosValidos.add(Constantes.CMD_LS);
    comandosValidos.add(Constantes.CMD_MKDIR);
    comandosValidos.add(Constantes.CMD_CD);
    comandosValidos.add(Constantes.CMD_TOUCH);
  }

  public boolean validarComando(String comandoIngresado) {
    for (int i = 0; i <= comandosValidos.size(); i++) {
      String comandoActual = comandosValidos.get(i);
      if (comandoActual.equals(comandoIngresado)) {
        return true;
      }
    }
    return false;
  }

  public static void mostrarMensajeError() {
    System.out.println("Unrecognized command");
  }
}
