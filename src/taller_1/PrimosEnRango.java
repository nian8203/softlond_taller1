package taller_1;

public class PrimosEnRango {
    
    public static void primo(){
        Integer[]dato = SolicitarDato.dosDatos();
        System.out.println("\n======================================");
        for (int i = dato[0]; i <= dato[1]; i++) {
            if (rangoPrimos(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n======================================\n");
    } 

    public static boolean rangoPrimos(int num) {
      
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    
    }


}