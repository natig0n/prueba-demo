package com.salesforce.fs;

import com.salesforce.fs.domain.Comando;
import com.salesforce.fs.domain.Ls;
import com.salesforce.fs.domain.Mkdir;
import com.salesforce.fs.domain.Pwd;
import com.salesforce.fs.domain.Quit;
import com.salesforce.fs.domain.Touch;

public class FactoriaComando {

  public static Comando getComandoIngresado(String cmd) {
    if (cmd.equals(Constantes.CMD_QUIT)) {
      return new Quit(cmd);
    } else if (cmd.equals(Constantes.CMD_PWD)) {
      return new Pwd(cmd);
    } else if (cmd.equals(Constantes.CMD_LS)) {
      return new Ls(cmd);
    } else if (cmd.equals(Constantes.CMD_MKDIR)) {
      return new Mkdir(cmd);
    } else if (cmd.equals(Constantes.CMD_TOUCH)) {
      return new Touch(cmd);
    }
    return null;
  }

}
