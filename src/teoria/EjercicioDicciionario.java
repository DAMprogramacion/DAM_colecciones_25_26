package teoria;

import java.util.*;

public class EjercicioDicciionario {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Map<Integer, Double[]> data = new HashMap<>();
        Double[] mark1 = {2.2, 3.3, 4.4};
        Double[] mark2 = {6.2, 7.3, 4.4};
        Double[] mark3 = {2.2, 8.3, 9.4};
        Double[] mark4 = {5.0, 5.0, 5.0};
        data.put(1, mark1);
        data.put(2, mark2);
        data.put(3, mark3);
        data.put(4, mark4);
        //System.out.println(data);
        String menu = """
                    1.- Mostrar datos.
                    2.- Añadir datos.
                    3.- Media califiaciones por alumno.
                    4.- Variar porcentaje de califación por módulo.
                    5.- Salir.
                    Elige opción:
                    
                    """;


        int option = -1;
        do {
            System.out.print(menu);
            option = scanner.nextInt();
            switch (option) {
                case 1 -> showData(data);
                case 2 -> addData(data);
                case 3 -> showAverageDataByModule(data);
                case 4 -> changeData(data);
                case 5 -> {
                    System.out.println("Fin de programa");
                    scanner.close();
                }
                default -> System.out.println("Opción no válida");
            }
        } while (option != 5);
    }

    private static void changeData(Map<Integer, Double[]> data) {
    }

    private static void showAverageDataByModule(Map<Integer, Double[]> data) {
        //solicitamos al usuario el valor del módulo para obtener la media
        System.out.println("Dame uno de los módulos [0 - 2]");
        int module = scanner.nextInt();
        double sum = 0;
        Set<Integer> keys = data.keySet();
        for (int key : keys) {
            Double[] marks = data.get(key);
            double mark = marks[module];
            sum += mark;
        }
        double average = sum / data.size();
        System.out.printf("El valor medio del módulo %d es: %.2f%n", module, average);
        //definir una variable sum = 0
        //recorrer el map y para cada alumno, sacar la nota del módulo correspondiente (0, 1, 2)
    }

    private static void addData(Map<Integer, Double[]> data) {
        //traeros todos los keys, sacar el último valor y sumamos + 1
        Set<Integer> keys = data.keySet();
        int newKey = 0;
        for (int key : keys) {
            newKey = key;
        }
        newKey++; //icrementamos una unidad, para el nuevo alumno
        //solicitamos tres notas
        //con esos valores creamos un array de tres doubles
        Double[] marks = new Double[3];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Introduce la nota del módulo: " + i);
            marks[i] = scanner.nextDouble();
        }
        //añadimos al map, con el metodo put(key, value)
        data.put(newKey, marks);
    }

    private static void showData(Map<Integer, Double[]> data) {
        /*Mostrar todos los alumnos y calificaciones:
        1 -> 1, 2, 5
        2 -> 2, 7, 7*/
        Set<Integer> keys = data.keySet();
        for (int key  : keys) {
           // System.out.println(key + " -> " + Arrays.toString(data.get(key)));
            System.out.printf("%d -> %s%n", key, Arrays.toString(data.get(key)));
        }
        System.out.println();
    }
}
/* Primero creais un diccionario mutable, con cuatro datos
KEY: posición alumno en la clase: 1, 2, 3, 4 ....
VALUE: calificaciones de tres módulos [5.5, 2.1, 6]
Menú:
1. Mostrar todos los alumnos y calificaciones:
        1 -> 1, 2, 5
        2 -> 2, 7, 7
        ............
2. Añadir un nuevo alumno y sus tres notas, se solicita las tres calificaciones
    y automáticamente el nº de lista se incrementa
3. Mostrar la media de calificaciones de un módulo, se solicita el módulo, ejemplo
    módulo 0, sería la posición 0 del array
4. Aumentamos la calificación de un módulo, de acuerdo a un porcentaje solicitado
    ejemplo, se solicita el módulo 0, y el porcentaje 20%,se incrementan todas las
    notas del módulo de posición 0
5. Salir
 */