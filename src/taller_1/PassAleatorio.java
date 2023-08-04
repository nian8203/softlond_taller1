package taller_1;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PassAleatorio {
    
    public static void genrarPass(){

        char letraMin = (char) (97 + Math.random() * 26);
        char letraMay = (char) (65 + Math.random() * 26);
        System.out.println(letraMay+" "+letraMin);
    }

    public static void generarContrasena() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        int longPass = 8;
        List<Character> caracteresAleatorios = new ArrayList<>();
        Random random = new SecureRandom();

        for (int i = 0; i < longPass; i++) {
            int indice = random.nextInt(caracteres.length());
            caracteresAleatorios.add(caracteres.charAt(indice));
        }

        StringBuilder contrasena = new StringBuilder();
        for (Character caracter : caracteresAleatorios) {
            contrasena.append(caracter);
        }
        System.out.println("\n======================================");
        System.out.println(contrasena.toString());
        System.out.println("======================================\n");
    }
}
