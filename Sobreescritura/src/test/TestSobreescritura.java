package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
       Empleado empleado = new Empleado ("Alejandro", 10000);
       empleado.obtenerDetalles();
       //System.out.println("Empleado = " + empleado.obtenerDetalles());
       imprimir(empleado);
       
       Gerente gerente = new Gerente ("Lorena", 20000, "Sistemas");
       //System.out.println("Gerente = " + gerente.obtenerDetalles());
       imprimir(gerente);
    }
    
    public static void imprimir(Empleado empleado){
         System.out.println("empleado = " + empleado.obtenerDetalles());
        
    }
    
    
    
    
}
