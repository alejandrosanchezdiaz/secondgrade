package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    static {
        System.out.println("Ejecucion bloque estatico");
    }

}
