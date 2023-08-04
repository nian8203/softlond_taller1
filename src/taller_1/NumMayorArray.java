package taller_1;

public class NumMayorArray {

    public static void operacion(){
        Integer[] numeros = {25,52,21,5,8,54,78,12,21};
        int mayor = Integer.MIN_VALUE;
        for (Integer numero : numeros) {
            if (mayor < numero) {
                mayor = numero;
            }
        }
        System.out.println("\n======================================");
        System.out.println("La suma es igual a = "+mayor);
        System.out.println("======================================\n");

    }
    
}
