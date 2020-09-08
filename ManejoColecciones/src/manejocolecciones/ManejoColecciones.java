package manejocolecciones;

import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add(2);
        miLista.add(3);
        
        miLista.add(3);
//        imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");
               
//        imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("Valor 1", "Alex");
        miMapa.put("Valor 2", "Lorena");
        miMapa.put("Valor 3", "Pepe");
        miMapa.put("Valor 3", "Jesús");
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        System.out.println(miMapa.get("Valor 3"));
        
        
                
    }
    
    private static void imprimir(Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
        System.out.println("");
    }
    
}
