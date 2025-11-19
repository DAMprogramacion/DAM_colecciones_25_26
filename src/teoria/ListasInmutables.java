package teoria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListasInmutables {
    public static void main(String[] args) {
       /* final List<Long> numerosLong = new ArrayList<>();
        System.out.println(numerosLong);
        numerosLong.add(56L);
        System.out.println(numerosLong);
        List<Long> numerosLong1 = new ArrayList<>();
        long numeroLong = 5655;
        numerosLong1.add(5655555L);numerosLong1.add(566666L);numerosLong1.add(5l);
        numerosLong1.addFirst(numeroLong);
        System.out.println(numerosLong1);
      //  numerosLong = numerosLong1; No se puede porque numeroLong es final
        numerosLong1 = numerosLong;*/
        //====================================================================
        byte[] bytes = {0, 1, 2, 3, 127,-128};
        System.out.printf("Tamaño del array: %d%n", bytes.length);
        System.out.println(bytes);
        System.out.println(Arrays.toString(bytes));
        bytes[2] = 100;
        System.out.println(Arrays.toString(bytes));
        List<Float> floats = List.of(1.1f, 2f, 3.3f, 4f, 5f); //lista inmutable
        System.out.println(floats);
       // floats.add(1.1f); no se puede añadir datos a una lista inmutable
        List<Float> nuevosFloats = new ArrayList<>();  //lista floats vacía
        nuevosFloats = floats;
        System.out.println(nuevosFloats);
      //  nuevosFloats.clear(); //limpia lista
      //  System.out.println(nuevosFloats); // [] hemos hecho una lista inmutable, indirectamente
    }
}
