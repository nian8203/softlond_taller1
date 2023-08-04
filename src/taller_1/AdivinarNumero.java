package taller_1;

import java.util.Scanner;

public class AdivinarNumero {

    public static void adivinar(){
        Scanner sc = new Scanner(System.in);
        int aleatorio = (int)(Math.random()*100);
        boolean estado = true;
        
        while (estado) {
            System.out.print("\nIngrese un valor numerico = ");
            int num = sc.nextInt();            
            //System.out.println("mi numero = "+num+"\naleatorio = "+aleatorio);  
                  
            
            if (num > aleatorio) {
                System.out.println("\nAun no lo adivinas!");
                System.out.println("El numero ingresado es mayor");
            }else if (num < aleatorio) {
                System.out.println("\nAun no lo adivinas!");
                System.out.println("El numero ingresado es menor");
            }else if (num == aleatorio) {
                System.out.println("Perfecto! has adivinado e numero");
                estado = false;
            }

            System.out.print("\nSi desea finalizar presione \"s\", \npara continuar \"enter\" ");
            sc.nextLine();
            String salir = sc.nextLine(); 
            
            if (salir.equalsIgnoreCase("s")) {
                System.out.println("\nHas salido del juego");
            }         

            
        }
        sc.close();
        
    }
    
}
