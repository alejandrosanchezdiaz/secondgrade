package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        
//        FiguraGeometrica figura = new FiguraGeometrica();

        FiguraGeometrica figura = new Rectangulo("Equilatero");
        figura.dibujar();
    }
}
