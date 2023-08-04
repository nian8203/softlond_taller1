package taller_1;

public class ContarLetrasCAdena {

    public static void letrasEnCadena(){
        String cadena = SolicitarDato.cadena();        
        char buscar = 'a';
        System.out.println("\n======================================");
        System.out.println("La letra \""+buscar+"\" se repite "+resultado(cadena, buscar)+" veces.");
        System.out.println("======================================\n");
    }

    public static int resultado(String cadena, char buscar){
        int cont = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == buscar) {
                cont++;
            }
        }
        return cont;
    }
    
}
