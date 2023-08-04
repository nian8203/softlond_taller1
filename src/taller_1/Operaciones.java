package taller_1;
import java.util.Scanner;

public class Operaciones {

    

    public static void solicitarNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese 2 numeros, el primero debe ser mayor al segundo.");
        System.out.print("- Ingrese el primer numero: ");
        Integer num1 = sc.nextInt();
        System.out.print("- Ingrese el segundo numero: ");
        Integer num2 = sc.nextInt();
        System.out.println(operaciones(num1, num2));
        sc.close();
    }
    
    private static String operaciones(Integer num1, Integer num2){
        Integer suma = num1 + num2;
        Integer resta = num1 - num2;
        Integer multi = num1 * num2;
        double div = 0;
        String división = "";

        if(num1 == 0 || num2 == 0){
            división = "Error! no se puede dividir por 0";
        }else if (num1 < num2) {
            división = "El primer numero debe ser mayor al segundo";
        }else{
            div = (double) num1 / num2;
            división = String.valueOf(div);
        }

        String resultado = "\n===Resultado operaciones===\n\n- Suma = "+suma+"\n- Resta = "
        +resta+"\n- Multiplicacíon = "+multi+"\n- División = "+división+"\n\n==========================\n";  
          
        return resultado;
        
    }
}
