import taller_1.AdivinarNumero;
import taller_1.AreaPerimetro;
import taller_1.BuscarNumArray;
import taller_1.CadenaInvertida;
import taller_1.ContarCaracteres;
import taller_1.ContarLetrasCAdena;
import taller_1.ConteoSimilitudes;
import taller_1.EliminarDuplicados;
import taller_1.Factorial;
import taller_1.FiboConParametro;
import taller_1.Fibonacci;
import taller_1.MatrizTablaMulti;
import taller_1.MayorMenorEdad;
import taller_1.NombreMayMin;
import taller_1.NumMayMen;
import taller_1.NumMayorArray;
import taller_1.NumeroCapicua;
import taller_1.NumeroPerfecto;
import taller_1.NumeroPrimo;
import taller_1.Operaciones;
import taller_1.OrdenAlfabetico;
import taller_1.OrderBurbuja;
import taller_1.PalabraPorsSeparado;
import taller_1.PalabrasContenidas;
import taller_1.Palindromo;
import taller_1.ParImpar;
import taller_1.PassAleatorio;
import taller_1.PositivoNegativo;
import taller_1.PrimosEnRango;
import taller_1.Redondeodecimal;
import taller_1.ReemplazarLetras;
import taller_1.RotacionElementos;
import taller_1.SumaEnterosArray;
import taller_1.TablaMultiplicar;
import taller_1.TrianHeron;

public class App {
    public static void main(String[] args) throws Exception {

        //los ejercicios estan el el orden establecido en el pdf de menor a mayor
        Operaciones.solicitarNumeros(); 
        ParImpar.solicitarNumero(); 
        AreaPerimetro.unDato();
        MayorMenorEdad.validarEdad();
        NumMayMen.validarNumero();
        PositivoNegativo.validarPosNeg();
        TablaMultiplicar.tabla();
        AdivinarNumero.adivinar();
        Factorial.factorial();
        Fibonacci.fibonacci();
        TrianHeron.areaTriangulo();
        NumeroPrimo.primo();
        Redondeodecimal.decimal();
        NumeroPerfecto.perfecto();
        NumeroCapicua.capicua();
        FiboConParametro.fibonacci();
        PrimosEnRango.primo();
        PassAleatorio.generarContrasena();
        NombreMayMin.nombre();
        CadenaInvertida.cadena();
        ContarLetrasCAdena.letrasEnCadena();
        Palindromo.palindromo();
        PalabrasContenidas.palabras();
        ReemplazarLetras.reemplazar();
        PalabraPorsSeparado.frase();
        ContarCaracteres.conteo();
        OrdenAlfabetico.ordenamiento();
        SumaEnterosArray.operacion();
        NumMayorArray.operacion();
        EliminarDuplicados.duplicados();
        OrderBurbuja.ordenar();
        OrderBurbuja.ordenar();
        BuscarNumArray.buscar();
        ConteoSimilitudes.conteo();
        RotacionElementos.rotacion();
        MatrizTablaMulti.tablaMultiplicar();






        

    }
}
