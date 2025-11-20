package teoria;

import java.util.HashMap;
import java.util.Map;

public class EjercicioDicciionario {
    public static void main(String[] args) {
        Map<Integer, Double[]> data = new HashMap<>();
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