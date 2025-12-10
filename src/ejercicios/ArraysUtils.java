package ejercicios;

import java.util.Arrays;

/**
 * <p>Es una clase que contiene métodos para tratar arrays de números enteros</p>
 * @author manuel
 * @version 1.0
 */
public class ArraysUtils {
    private ArraysUtils() {}
    /**
     * <p>Método que nos devuelve la suma de los elementos</p>
     * <p>de un array de números enteros</p>
     * @param array es la colección de tipo array sobre la que va a actuar el método
     * @return <p>un número entero con la suma de los números que contiene el array</p>
     *          <p>en el caso de un array vacío devuelve 0</p>
     *          <p>en el caso de que la referencia del array sea null devuelve null</p>
     */

    public static Integer sumItemsOfArray (int[] array) {
        if (array == null)
            return  null;
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    /**
     *
     * @param array
     * @return
     */
    public static int[] getMinimumMaximumOfArray (int[] array) {
        if (array == null)
            return null;
        if (array.length == 0)
            return new int[]{};
        int[] values = new int[2];
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            else if (array[i] > max)
                max = array[i];
        }
        values[0] = min;
        values[1] = max;
        return values;
    }

    /**
     *
     * @param array
     * @return
     */
    public static int[] getArrayWithoutDuplicates(int[] array) {
        Arrays.sort(array); //arrayordenado
        int sizeArrayWD = array.length;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1])
                sizeArrayWD--;
        }
        int[] arrayWD = new int[sizeArrayWD];
        arrayWD[0] = array[0];
        int duplicates = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1])
                duplicates++;
            else{
               // System.out.println(array[i]);
                arrayWD[i - duplicates] = array[i];
            }
        }
        return arrayWD;
    }

    /**
     *
      * @param array
     * @param position
     * @return
     */
    public static int[] rotatePositionsInArrays (int[] array, int position){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            newArray[(i + position) % array.length] = array[i];
        }
        return newArray;
    }
    /*public static void main(String[] args) {
        int[] array = {9,9,9,9,9,-9,10, 1, 2, 3, 4, 5, 6, -1, 1, -1};
        System.out.println(Arrays.toString(array));
        int[] newArray = rotatePositionsInArrays(array, 2);
        System.out.println(Arrays.toString(newArray));
        int sum = sumItemsOfArray(array);
        System.out.printf("La suma de los valores del array vale %d%n", sum);
        int[] values = getMinimumMaximumOfArray(array);
        System.out.printf("Valor mas chico es %d y el más grande %d%n", values[0], values[1]);
        int[] arrayWD = getArrayWithoutDuplicates(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayWD));
    }*/
}
