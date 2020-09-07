package test;

import domain.Empleado;

public class TestClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Lorena", 500000);
        Empleado empleado2 = new Empleado("Alex", 500000);

        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }

        if (empleado1.equals(empleado2)) {
            System.out.println("Son iguales en contenido");
        } else {
            System.out.println("Son diferentes en contenido");
        }

        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("Son iguales en hashcode");
        } else {
            System.out.println("Son diferentes en hashcode");
        }

    }
}
