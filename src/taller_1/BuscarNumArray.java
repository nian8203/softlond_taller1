package taller_1;


public class BuscarNumArray {
    
    public static void buscar(){
        int[] arr = {25,5,52,21,5,8,54,25,78,12,21,78,25};
        int buscar = 95; //numero de busqueda en el array
        int indice = -1;
        String msg = "";
        
        for (int i = 0; i < arr.length; i++) {
            if (buscar == arr[i]) {                
                indice = i;
                msg = " se encuentra en la posicion "+ Integer.valueOf(indice);
                break;
            }else{
                msg = " no se ha encontrado";
            }
        }
        System.out.println("\n======================================");
        System.out.println("El numero "+buscar+msg);
        System.out.println("======================================\n");
    }

}
