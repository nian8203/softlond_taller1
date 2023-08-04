package taller_1;

public class TablaMultiplicar {
    
    public static void tabla(){
        
        System.out.println("\n======================================");
        String msg = "Ingrese valor numerico positivo";
        int num = SolicitarDato.unDato(msg);
        System.out.println("\n======================================");
        for(int i = 1; i <= 10; i++){System.out.println(num+" X "+i+" = "+(num*i));}
        System.out.println("======================================\n");
    }
}
