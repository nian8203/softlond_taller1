package taller_1;

import java.util.Arrays;

public class RotacionElementos {

    public static void rotacion() {

        int[] nums = {25,52,21,5,8,54,78,12,21};
        int positions = 2; // Cantidad de posiciones de desplazamiento 
        boolean rotateLeft = true; // Cambiar el estado para desplazar a la derecha
        
        
        System.out.println("\n======================================");
        System.out.println("Arreglo original:");
        printArray(nums);
        rotateArray(nums, positions, rotateLeft);
        System.out.println("======================================");
        System.out.println("Arreglo rotacio datos:");
        printArray(nums);
        System.out.println("======================================\n");
               
    }

    public static void rotateArray(int[] arr, int positions, boolean rotateLeft) {
        int n = arr.length;
        positions %= n;//validar qe las posiciones no sean mayores que la longitud del arreglo
        
        if (rotateLeft) {
            // deplazamiento a la izquierda
            int[] temp = Arrays.copyOfRange(arr, 0, positions);
            System.arraycopy(arr, positions, arr, 0, n - positions);
            System.arraycopy(temp, 0, arr, n - positions, positions);
        } else {
            // desplazamiento a la derecha
            int[] temp = Arrays.copyOfRange(arr, n - positions, n);
            System.arraycopy(arr, 0, arr, positions, n - positions);
            System.arraycopy(temp, 0, arr, 0, positions);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
