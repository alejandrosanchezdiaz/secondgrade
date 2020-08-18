package Test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades [] = {5, 6, 7, 8};
        for(int edad: edades){
            System.out.println("Edad: " + edad);
        }
        
        
        
        Persona personas[] = {new Persona("Alex"), new Persona("Lorena"), new Persona("Alberto")};
        for(Persona persona: personas){
            System.out.println("Personas: " + persona);
        }
    }
}
