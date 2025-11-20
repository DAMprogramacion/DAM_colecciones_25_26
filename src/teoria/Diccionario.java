package teoria;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "juan"); map.put(2, "esteban"); map.put(45, "melisa");
        map.put(1, "juani"); map.put(22, "federico"); map.put(44, "melisa");
        map.put(10, "sebastian"); map.put(2, "daniel"); map.put(4, "pedro");
        System.out.println(map);
        System.out.printf("Tamaño del diccionario; %d%n", map.size());
        String getK1 = map.get(1); String getK22 = map.get(22); String getK100 = map.get(100);
        System.out.printf("Clave 1, valor: %s%n", getK1); //obtiene por valor de clave
        System.out.printf("Clave 22, valor: %s%n", getK22); //NO POR POSICIÓN
        System.out.printf("Clave 100, valor: %s%n", getK100);
        String remove1 = map.remove(1);
        String remove100 = map.remove(100);
        System.out.printf("Eliminado %S de clave 1%n", remove1);
        System.out.printf("Eliminado %S de clave 100%n", remove100);
        System.out.printf("Tamaño del diccionario; %d%n", map.size());
        boolean contain1 = map.containsKey(1); //EFICIENTE
        boolean contain22 = map.containsKey(22);
        System.out.printf("¿Existe elemento de clave 1?: %b%n", contain1);
        System.out.printf("¿Existe elemento de clave 22?: %b%n", contain22);
        boolean melisa  = map.containsValue("melisa"); //MENO EFICIENTE
        boolean felipe = map.containsValue("felipe");
        System.out.printf("¿Existe melisa?: %b%n", melisa);
        System.out.printf("¿Existe felipe?: %b%n", felipe);
        String name = map.replace(4, "antonio"); //devuele el antiguo valor
        System.out.printf("Eliminado %S del map%n", name);
        System.out.printf("Valor de la key 4: %S%n", name);
        System.out.println(map);
        boolean bName = map.replace(4, "antonio", "antoñita");
        System.out.printf("¿Reemplazado Antonio por Antoñita?: %B%n", bName);
        System.out.println(map);


    }
}
