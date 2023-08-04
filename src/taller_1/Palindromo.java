package taller_1;

public class Palindromo {

    public static void palindromo() {
        String cadena = SolicitarDato.cadena();
        String res = validar(cadena)? "Es palindromo": "No es palindromo";
        System.out.println("\n======================================");
        System.out.println(res);
        System.out.println("======================================\n");
    }

    private static boolean validar(String cadena) {
        String invertida = "";        
        for (int i = cadena.length()-1; i >= 0 ; i--) {
            char letra = cadena.charAt(i);
            invertida += letra;
        }
        return cadena.equals(invertida);
    }
}
