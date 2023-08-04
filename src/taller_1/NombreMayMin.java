package taller_1;

import java.util.Scanner;

public class NombreMayMin {
    
    public static void nombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n======================================");
        System.out.print("Ingrese un nombre: ");
        String nombre = sc.nextLine();
        System.out.println("======================================\n");
        
        System.out.println("\n======================================");
        System.out.println("Nombre en minusculas: "+nombre.toLowerCase()+"\nNombre en mayusculas: "+nombre.toUpperCase());
        System.out.println("======================================\n");
        sc.close();
    }
}
