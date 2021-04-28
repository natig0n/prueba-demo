package com.salesforce.fs.domain;

import java.io.File;
import com.salesforce.fs.Constantes;

public class Touch extends Comando {

  public Touch(String cmd) {
    super.setNombre(cmd);
  }

  @Override
  public void correrComando() throws Exception {
    File directorio = new File(".");
    String ruta = directorio.getCanonicalPath() + Constantes.CARPETA_NUEVA;
    File carpetaNueva = new File(ruta);
    if (!carpetaNueva.exists()) {
      if (directorio.mkdirs()) {
        System.out.println(Constantes.DIRECTORIO_CREADO);
      } else {
        System.out.println(Constantes.ERROR_DIRECTORIO_CREADO);
      }
    }
  }
}
