package ejercicios;

import java.util.Arrays;

public class SetUtils {
    public static void main(String[] args) {
        String texto = "Esto es un ejemplo de como extraer palabras del texto";
        String[] tokens = texto.split(" ");
        System.out.println(Arrays.toString(tokens));
    }
}
