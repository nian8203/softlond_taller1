package taller_1;

public class NumeroCapicua {
    
    public static void capicua(){
        String msg = "Ingrese un numero que tenga mas de una cifra";
        int num = SolicitarDato.unDato(msg);
        System.out.println("\n======================================");
        System.out.println(validar(num));
        System.out.println("======================================\n");
    }

    private static String validar(int num){
        
        String res = "";
        int temp = num;
        while (num > 0) {
            int digito = num % 10;
            res += digito;
            num /= 10;
        }
        int capicua = Integer.valueOf(res);
        return temp == capicua? "El número "+temp+" es capicúa": "El número "+temp+" no es capicúa";
    }
}
