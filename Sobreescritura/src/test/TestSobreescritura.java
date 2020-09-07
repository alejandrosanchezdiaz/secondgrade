package test;

import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Alejandro", 5999.99, "Sistemas");
        System.out.println("Gerente1 = " + gerente1.obtenerDetalles());
    }
}
