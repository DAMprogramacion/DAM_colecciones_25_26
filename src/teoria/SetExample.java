package teoria;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("pepe"); names.add("juani"); names.add("esteban");
        names.add("wenceslao"); names.add("higinio"); names.add("marisa");
        names.add("lucas"); names.add("victoria"); names.add("maría");
        System.out.println(names);
        System.out.printf("Tamaño de la colección %d%n", names.size());
        names.add("lucas"); names.add("victoria"); names.add("jacinto");
        System.out.println(names);
        System.out.printf("Tamaño de la colección %d%n", names.size());
        boolean containLucas = names.contains("lucas");
        System.out.printf("Contiene el nombre de lucas: %B%n", containLucas);
        boolean removeLucas = names.remove("Lucas");
        System.out.printf("Eliminado lucas %B%n", removeLucas);
        boolean removelucas = names.remove("lucas");
        System.out.printf("Eliminado lucas %B%n", removelucas);


    }
}
