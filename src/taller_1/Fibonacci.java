package taller_1;

public class Fibonacci {
    
    public static void fibonacci(){
        System.out.println("\n========================================");
        System.out.println("=========SERIR FIBONACCI==============");
        int temp = 0;
        int ini = 1;
        int fib = 0;
        int sec = 20;

        for (int i = 1; i < sec; i++) {
            System.out.println(fib);
            fib = temp + ini;
            temp = ini;
            ini = fib;
        }
    }
}
