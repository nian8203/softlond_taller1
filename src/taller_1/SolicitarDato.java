package taller_1;

import java.util.Scanner;

public class SolicitarDato {

    public static Integer unDato(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n======================================");
        System.out.println(msg);
        System.out.print("\nIngrese un valor: ");
        int dato = sc.nextInt(); 
        System.out.println("======================================\n");
        sc.close();
        return dato;       
    }

    public static Integer[] dosDatos(){
        Scanner sc = new Scanner(System.in);
        Integer[] datos = new Integer[2];
        System.out.println("\n======================================");
        System.out.println("Ingresar 2 valores numericos positivos");
        System.out.print("\nIngrese primer valor: ");
        datos[0] = sc.nextInt(); 
        System.out.print("Ingrese segundo valor: ");
        datos[1] = sc.nextInt(); 
        System.out.println("======================================\n");
        sc.close();
        return datos;       
    }

    public static Integer[] tresDatos(){
        Scanner sc = new Scanner(System.in);
        Integer[] datos = new Integer[3];
        System.out.println("\n======================================");
        System.out.println("Ingresar 3 valores numericos positivos");
        System.out.print("\nIngrese primer valor: ");
        datos[0] = sc.nextInt(); 
        System.out.print("Ingrese segundo valor: ");
        datos[1] = sc.nextInt(); 
        System.out.print("Ingrese tercer valor: ");
        datos[2] = sc.nextInt(); 
        System.out.println("======================================\n");
        sc.close();
        return datos;       
    }

    public static String cadena(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n======================================");
        System.out.print("Ingrese una cadena : ");
        String cadena = sc.nextLine();
        System.out.println("======================================\n");
        sc.close();
        return cadena;
    }

    public static String frase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n======================================");
        System.out.print("Ingrese una frase : ");
        String cadena = sc.nextLine();
        System.out.println("======================================\n");
        sc.close();
        return cadena;
    }
    
}
