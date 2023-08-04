package taller_1;

import java.util.Arrays;

public class EliminarDuplicados {

    public static void duplicados(){
        int[] arr = {25,5,52,21,5,8,54,25,78,12,21,78,25};
        int[] distinct = Arrays.stream(arr).distinct().toArray();
        System.out.println("\n======================================");
        System.out.println(Arrays.toString(distinct));
        System.out.println("======================================\n");
    }
    
}
