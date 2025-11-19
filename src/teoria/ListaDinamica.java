package teoria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaDinamica {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); //lista de enteros vacía
        Scanner scanner = new Scanner(System.in);
        //solicitamos el nº de elementos, rango 10-20, fuera de rango se vuelve a solicitar
        int numberOfElements = -1;
        do {
            System.out.println("Introduce el nº de elementos, rango 10 - 20 inclusive");
            numberOfElements = scanner.nextInt();
        } while (numberOfElements < 10 || numberOfElements > 20);
        //rellenar con ese número de elementos la lista, usamos Math.random y el metodo de las listas
        for (int i = 0; i < numberOfElements; i++) {
            int random = (int) (Math.random() * 100 + 1);
            numbers.add(random);
        }
        //comprobamos la lista
        System.out.println(numbers);
        //solicitamos un número entre 1 a 100, para buscarlo en la lista
        int number = -1;
        do {
            System.out.println("Introduce el nº entre 1 y 100, inclusive");
            number = scanner.nextInt();
        } while (number < 1 || number > 100);
        //comprobamos que está en la lista
        if (numbers.contains(number)){
            System.out.printf("analizando el número %d%n", number);
            int counter = 0;
            for (int i = 0; i < numbers.size(); i++) {
                int element = numbers.get(i);
                if (element == number) {
                    System.out.printf("Encontrado en la posición: %d%n", i);
                    counter++;
                }
            }
            System.out.printf("Nº de veces que contiene al número: %d%n", counter);
        } else
            System.out.printf("El número %d, no está en la lista%n", number);
        //ordenamos la lista
        Collections.sort(numbers);
        System.out.println(numbers);
        int tinyNumber = numbers.getFirst();//   int tinyNumber = numbers.get(0);
        int bigNumber  = numbers.getLast(); //   int bigNumber  = numbers.get(numbers.size() - 1);
        System.out.printf("El valor mas pequeño es %d, y el mas grande %d%n",
                tinyNumber, bigNumber);

    }
}
