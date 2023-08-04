package taller_1;
import java.util.Scanner;

public class ParImpar {
    
    public static void solicitarNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDeterminar si un numero es par o impar");
        System.out.print("- Ingrese un numero: ");
        Integer num1 = sc.nextInt();
        System.out.println(validar(num1));
        sc.close();
    }

    private static String validar(Integer num){
        return (num%2==0)?"El numero ingresado es par.": "El numero ingresado es impar.";
    }
}
