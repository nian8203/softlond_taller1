package taller_1;

public class ContarCaracteres {
    
    public static void conteo(){
        String cadena = SolicitarDato.cadena();
        System.out.println("\n======================================");
        System.out.println("La frase contiene "+caracteres(cadena)+" caracteres.");
        System.out.println("======================================\n");

    }

    private static int caracteres(String cadena){
        String nuevaCadena = cadena.replaceAll(" ", "");
        int cont = 0;
        for (int i = 0; i < nuevaCadena.length(); i++) cont++;        
        return cont;
    }
}
