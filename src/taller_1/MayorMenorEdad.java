package taller_1;

import java.util.Scanner;

public class MayorMenorEdad {
    
    public static void validarEdad(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite una edad: ");
        int edad = sc.nextInt();
        String res = edad >= 18? "Es mayor de edad": "Es menor de edad";
        System.out.println("\n======================================");
        System.out.println(res);
        System.out.println("======================================\n");
        sc.close();
    }
}
