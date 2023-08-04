package taller_1;

import java.util.Arrays;

public class OrdenAlfabetico {

    public static void ordenamiento(){
        String frase =  SolicitarDato.frase();
        String[] nuevaFrase = frase.split(" ");
        Arrays.sort(nuevaFrase);
        System.out.println("\n======================================");
        System.out.println(Arrays.toString(nuevaFrase));
        System.out.println("======================================\n");

    }

    
    
}
