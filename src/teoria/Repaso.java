package teoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repaso {
    public static void main(String[] args) {
        /*int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(numeros);
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Posicion %d, valor %d%n", i, numeros[i]);
        }
        System.out.println("==========================");
        for (int numero : numeros){
            System.out.printf("%-3d", numero);
        }
        String[] cadenas = new String[3];
        System.out.println();
        System.out.println(Arrays.toString(cadenas));
        cadenas[0] = "juan"; cadenas[1] = "esteban"; cadenas[2] = "marisa";
        System.out.println(Arrays.toString(cadenas));
        //cadenas[4] = "felipe";*/
        System.out.println("=====Listas dinámicas=========");
        List<Double> numerosDoubles = new ArrayList<>();
        System.out.println(numerosDoubles);
        numerosDoubles.add(2.2); numerosDoubles.add(3.3);
        for (int i = 0; i < numerosDoubles.size(); i++) {
            System.out.printf("Posicion %d, valor %6.2f%n", i, numerosDoubles.get(i));
        }
        for (double numeroDoble  : numerosDoubles)
            System.out.printf("%6.2f", numeroDoble );
        for (int i = 0; i < 15 ; i++) {
            numerosDoubles.add(Math.random() * 100);
        }
        System.out.printf("\nTamaño de lista %d%n", numerosDoubles.size());
        System.out.println(numerosDoubles);
        for ( double numero  :  numerosDoubles)
            System.out.println(numero);
        //eliminamos un elemento
        numerosDoubles.remove(0);
        System.out.printf("\nTamaño de lista %d%n", numerosDoubles.size());
        System.out.println(numerosDoubles);
        int posicion = 100;
        if (posicion > 0 && posicion < numerosDoubles.size())
            numerosDoubles.remove(posicion);
        System.out.printf("\nTamaño de lista %d%n", numerosDoubles.size());
        System.out.println(numerosDoubles);
        posicion = 10;
        if (posicion > 0 && posicion < numerosDoubles.size())
            numerosDoubles.remove(posicion);
        System.out.printf("\nTamaño de lista %d%n", numerosDoubles.size());
        System.out.println(numerosDoubles);
        boolean contieneNumero = numerosDoubles.contains(3.3);
        System.out.printf("¿Contiene el 3.3? %B%n", contieneNumero);
        int posicionNumero = numerosDoubles.indexOf(3.3);
        System.out.printf("Posición de 3.3: %d%n", posicionNumero);
        numerosDoubles.addFirst(5.5);
        posicionNumero = numerosDoubles.indexOf(3.3);
        System.out.printf("Posición de 3.3: %d%n", posicionNumero);
        numerosDoubles.set(2, 4.4);
        System.out.println(numerosDoubles);
        List<Double> sublista = numerosDoubles.subList(0 , 3);
        System.out.println(sublista);
        List<Double> subListaReverse = sublista.reversed();
        System.out.println("======Lista original========");
        System.out.println(numerosDoubles);
        System.out.println("======Sublista========");
        System.out.println(sublista);
        System.out.println("======Sublista reverse========");
        System.out.println(subListaReverse);

    }


}
