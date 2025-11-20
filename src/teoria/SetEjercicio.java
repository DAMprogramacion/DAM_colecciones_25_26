package teoria;

import java.util.*;

public class SetEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Integer> numberList = new ArrayList<>();
        Set<Integer>  numberSet  = new HashSet<>();
        int numberOfElements = -1;
        do {
            System.out.println("Introduce el nº de elementos, entre 10 y 20, ambos inclusive");
            numberOfElements = scanner.nextInt();
        } while ( numberOfElements < 10 || numberOfElements > 20);
        for (int i = 0; i < numberOfElements; i++) {
            int randomNumber = random.nextInt(1, 101);
            numberList.add(randomNumber);
            numberSet.add(randomNumber);
        }
        System.out.println(numberList);
        System.out.println(numberSet);
        System.out.printf("Nº de repetidos %d%n", numberList.size() - numberSet.size());
    }
}



