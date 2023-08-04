package taller_1;

public class MatrizTablaMulti {

    public static void tablaMultiplicar(){

        int[][] tablas = new int[10][10];
        
        for(int i = 0;i<10;i++)
        {
            for (int j = 0; j < 10; j++) {tablas[i][j] = (i + 1) * (j + 1);}
        }
            
        for(int i = 0;i<10;i++)
        {
            System.out.println("Tabla del " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {System.out.println((i + 1) + " x " + (j + 1) + " = " + tablas[i][j]);}
            System.out.println();
        }
    }

}
