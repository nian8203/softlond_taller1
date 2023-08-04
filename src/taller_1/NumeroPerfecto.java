package taller_1;

public class NumeroPerfecto {
    
    public static void perfecto(){

        String msg = "Ingrese un numero entero positivo";
        Integer dato = SolicitarDato.unDato(msg);
        System.out.println("\n======================================");
        System.out.println(validarNumero(dato));
        System.out.println("======================================\n");
    }

    private static String validarNumero(int num){
        int res = 0;
        for (int i = 1; i < num; i++) {
            if (num%i==0) {
                res += i;
            }
        }
        return res == num? "El numero "+num+" es perefecto": "El numero "+num+" no es perfecto";
    }
}
