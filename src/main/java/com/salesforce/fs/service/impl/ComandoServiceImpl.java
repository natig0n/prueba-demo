package com.salesforce.fs.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.salesforce.fs.Constantes;
import com.salesforce.fs.FactoriaComando;
import com.salesforce.fs.domain.Comando;

public class ComandoServiceImpl {

  public static List<String> comandosValidos = new ArrayList<String>();

  public static void mostrarMensajeError() {
    System.out.println(Constantes.COMANDO_NO_RECONOCIDO);
  }

  public static void ejecutarComandoIngresado(String comandoIngresado) {
    Comando cmd = FactoriaComando.getComandoIngresado(comandoIngresado);
    if (cmd == null) {
      mostrarMensajeError();
    } else {
      cmd.ejecutar();
    }
  }

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
}
