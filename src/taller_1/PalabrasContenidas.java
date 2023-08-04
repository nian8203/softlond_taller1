package taller_1;

public class PalabrasContenidas {
    
    public static void palabras(){
        String frase = SolicitarDato.frase();
        System.out.println("\n======================================");
        System.out.println("La frase contine "+resultado(frase)+" palabras.");
        System.out.println("======================================\n");

    }

    private static int resultado(String frase){
        int cont = 0;
        String[] palabra = frase.split(" ");
        for (String p : palabra) {
            cont++;
        }
        
        return cont;
    }

}
