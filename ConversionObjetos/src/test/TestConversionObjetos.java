package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor ("Alex", 200000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);
        
        System.out.println(empleado.obtenerDetalles());
        
//        ((Escritor)empleado).getTipoEscritura();
        
        
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        Empleado empleado2 = escritor;
        
    }
}
