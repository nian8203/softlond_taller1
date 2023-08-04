package taller_1;

import java.util.Arrays;

public class OrderBurbuja {
    
    public static void ordenar(){
        int[] num = {25,5,52,21,5,8,54,25,78,12,21,78,25};
        int n = num.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        System.out.println("\n======================================");
        System.out.println(Arrays.toString(num));
        System.out.println("======================================\n");
    }
}
