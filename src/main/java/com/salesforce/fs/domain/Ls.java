package com.salesforce.fs.domain;

import java.io.File;
import com.salesforce.fs.Constantes;

public class Ls extends Comando {

  public Ls(String cmd) {
    super.setNombre(cmd);
  }

  @Override
  public void correrComando() throws Exception {
    File directorio = new File(".");
    String ruta = directorio.getCanonicalPath();
    File carpeta = new File(ruta);
    String[] listado = carpeta.list();
    if (listado == null || listado.length == 0) {
      System.out.println(Constantes.CARPETA_SIN_ELEMENTOS);
      return;
    } else {
      for (int i = 0; i < listado.length; i++) {
        System.out.println(listado[i]);
      }
    }
  }

}
