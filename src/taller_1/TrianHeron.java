package taller_1;

public class TrianHeron {
    
    
    public static void areaTriangulo(){
        Integer[] dato = SolicitarDato.tresDatos();
        double s = calcularArea(dato[0], dato[1], dato[2]);
        System.out.println(s);
    }

    private static double calcularArea(int num1, int num2, int num3){
        double s = (num1+num2+num3)/2;
        double a = s * ((s-num1)*(s-num2)*(s-num3));
        return Math.sqrt(a);
    }


}
