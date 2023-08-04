package taller_1;

public class PalabraPorsSeparado {
    
    public static void frase(){
        String frase = SolicitarDato.frase();
        String[] separadas = frase.split(" ");
        System.out.println("\n======================================");
        for (String s : separadas) {
            System.out.println(s);
        }
        System.out.println("======================================\n");


    }

   
}
