package taller_1;

import java.util.Scanner;

public class CadenaInvertida {

    public static void cadena(){
        Scanner sc = new Scanner(System.in);
        String nueva = "";
        System.out.println("\n======================================");
        System.out.print("Ingrese una cadena : ");
        String cadena = sc.nextLine();
        System.out.println("======================================\n");

        for (int i = cadena.length()-1; i >= 0; i--) {
            char letra =  cadena.charAt(i);
            nueva += letra;            
        }
        
        System.out.println("\n======================================");
        System.out.println("Cadena invertida: "+nueva);
        System.out.println("======================================\n");
        sc.close();
    }
    
}
