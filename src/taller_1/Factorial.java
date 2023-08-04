package taller_1;

public class Factorial {
    
    public static void factorial(){
        System.out.println("\n========================================");
        String msg = "Ingrese un valor numerico positivo";
        int num = SolicitarDato.unDato(msg);
        int factorial = 1;

        for (int i = 1; i < num+1; i++) {
            factorial *= i;
            System.out.println(factorial);
        }
    }
}
