package taller_1;

public class SumaEnterosArray {
    
    public static void operacion(){
        Integer[] numeros = {25,52,21,5,8,54,78};
        int res = 0;
        for (Integer numero : numeros) {
            res += numero;
        }
        System.out.println("\n======================================");
        System.out.println("La suma es igual a = "+res);
        System.out.println("======================================\n");

    }
}
