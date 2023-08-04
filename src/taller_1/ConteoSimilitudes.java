package taller_1;

import java.util.HashMap;
import java.util.Map;

public class ConteoSimilitudes {    

    public static void conteo() {
        int[] arr = {25,5,52,21,5,8,54,25,78,12,21,78,25,8,78,25};
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int elemento = arr[i];
            if (frecuencia.containsKey(elemento)) {
                frecuencia.put(elemento, frecuencia.get(elemento) + 1);
            } else {
                frecuencia.put(elemento, 1);
            }
        }

        System.out.println("\n=====================");
        System.out.println("Numero  | Frecuencia");
        for (Map.Entry<Integer, Integer> entrada : frecuencia.entrySet()) {
            System.out.println(entrada.getKey()+" \t| "+entrada.getValue());
        }
        System.out.println("====================\n");
    }

    
}
