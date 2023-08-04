package taller_1;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Redondeodecimal {

    public static void decimal() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Ingrese un numero con decimales separado por coma: ");
        double numDec = sc.nextDouble();  
        // String resultado = String.format("%.2f", numDec);
        //modificar el numero de # dependiendo de el numero de decimales que se desea obtener
        DecimalFormat df = new DecimalFormat("#.##"); 
        System.out.println(df.format(numDec));
        sc.close();
    }

    
}
