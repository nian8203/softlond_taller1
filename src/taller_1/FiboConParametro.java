package taller_1;

public class FiboConParametro {

    public static void fibonacci() {
        String msg = "Ingrese un valor numerico positivo";
        int num = SolicitarDato.unDato(msg);
        System.out.println("\n======================================");
        System.out.println(crearSecuencia(num));
        System.out.println("======================================\n");
    }

    private static String crearSecuencia(int num) {

        int ini = 0;
        int temp = 1;
        int res = 0;
        String fibo = "";
        for (int i = 0; i < num; i++) {
            res = ini + temp;           
            if (temp <= num) {fibo += temp + ",";}
            ini = temp;
            temp = res;
        }

       return fibo;
    }
}
