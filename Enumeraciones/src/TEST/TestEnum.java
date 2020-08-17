package TEST;

import enumeraciones.CONTINENTES;
import enumeraciones.Enumeraciones;

public class TestEnum {
    public static void main(String[] args) {
//        System.out.println("First day: " + Enumeraciones.MONDAY);
//        indicarDiaSemana(Enumeraciones.TUESDAY);

        System.out.println("Continente nº4: " + CONTINENTES.AMERICA);
        System.out.println("Paises del continente: " + CONTINENTES.AMERICA.getPaises());
        
        System.out.println("Continente nº1: " + CONTINENTES.AFRICA);
        System.out.println("Paises del continente: " + CONTINENTES.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Enumeraciones dias){
        switch(dias){
            case MONDAY:
                System.out.println("First Day of the Week");
                break;
            case TUESDAY:
                System.out.println("Second day of the week");
                break;
            case WEDNESDAY:
                System.out.println("Third day of the week");
        }
            
    }
        
   
}
