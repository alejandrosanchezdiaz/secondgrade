package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes de tipos primitivos:
        /*
        
        int - Integer
        long - Long
        float - Float
        double - Double
        
        */
        
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.doubleValue());
        
        int entero2 = entero;
        System.out.println(entero2);
        
        
        
    }
}
