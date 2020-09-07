package paquete1;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
       Clase1 clase1 = new Clase1("Publico");
       clase1.setAtributoPrivate("Cambio valor atributo");
        System.out.println("clase1 = " + clase1.getAtributoPrivate());
    }
}
