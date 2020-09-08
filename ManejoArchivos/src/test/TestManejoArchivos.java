package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {

        var nombreArchivo = "prueba.txt";

//        crearArchivo(nombreArchivo);
//        anexarArchivo(nombreArchivo, "Hola mundo jeje");
//        anexarArchivo(nombreArchivo, "Me voy del mundo jeje");


        leerArchivo(nombreArchivo);
        
    }
}
