package paquete1;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {

    public ClaseHija() {
        super();
        this.atributoDefault = "Modificación atributo default";
        System.out.println("Atributo default = " + this.atributoDefault);
        this.metodoDefault();
    }
}
