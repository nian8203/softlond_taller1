package taller_1;

public class NumeroPrimo {

    public static void primo(){
        String msg = "Ingrese un valor numerico entero";
        Integer num = SolicitarDato.unDato(msg);
        String res = validar(num)? "El numero "+num+" no es primo": "El numero "+num+" es primo";
        System.out.println(res);
    }

    private static boolean validar(int num){
        int cont = 0;

        for (int i = 1; i <= num; i++) {
            System.out.println(num+" "+i);
            System.out.println(num%i==0);
            if (num%i==0) {
                cont++;
            }
        }

        return cont>2;
    }
    
}
