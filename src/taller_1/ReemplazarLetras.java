package taller_1;

public class ReemplazarLetras {
    
    public static void reemplazar(){
        char letra = 'a';
        String cadena = SolicitarDato.cadena();
        System.out.println("\n======================================");
        System.out.println(resultado(cadena, letra));
        System.out.println("======================================\n");

    }

    private static String resultado(String cadena, char letra){
        char temp = 'Z';
        String nueva = "";
        for (int i = 0; i < cadena.length(); i++) {
            char letraChar = cadena.charAt(i);
            if (letra == letraChar) {
                nueva += temp;
            }else{
                nueva += letraChar;
            }
        }
        return nueva;
    }
}
