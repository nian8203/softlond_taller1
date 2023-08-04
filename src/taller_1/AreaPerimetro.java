package taller_1;
import java.util.Scanner;

public class AreaPerimetro {
    
    private static final double PI = 3.1416;

    public static void unDato(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese un valor numerico: ");
        int dato = sc.nextInt();        
        System.out.println("\n======================================");
        System.out.println("Perimetro = "+perimetro(dato)+"\nArea = "+area(dato));
        System.out.println("======================================\n");
        sc.close();
    }

    private static double perimetro(int radio){
        return (2*PI)*radio;
    }

    private static double area(int radio){
        return (PI*radio)*radio;
    }
}
