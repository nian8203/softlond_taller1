package taller_1;

public class NumMayMen {
    
    public static void validarNumero(){
         Integer[]num = SolicitarDato.dosDatos();
        String temp = num[0] > num[1]? "El numero "+num[0]+" es mayor que el "+num[1]: "El numero "+num[1]+" es mayor que el "+num[0];
        System.out.println(temp);
    }
}
