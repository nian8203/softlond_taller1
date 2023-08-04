package taller_1;

public class PositivoNegativo {
    
    public static void validarPosNeg(){
        String msg = "Ingresar cualquier valor numerico positivo o negativo";
        Integer num = SolicitarDato.unDato(msg);
        String res = "El numero es = "+num;
        if (num > 0) 
            res = "El numero "+num+" es positivo";
        else if(num < 0)
            res = "El numero "+num+" es negativo";

        System.out.println("\n======================================");
        System.out.println(res);
        System.out.println("======================================\n");
    }
}
