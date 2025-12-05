package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MapUtils {
    public static List<String> listWords (String path) throws FileNotFoundException {
        List<String> setWords = new ArrayList<>();
        Scanner scanner = new Scanner(new File(path));
        String linea = "";
        int countLine = 0;
        int countWords = 0;
        while (scanner.hasNextLine()) {
            linea = scanner.nextLine().toLowerCase().replaceAll("[.,;]", "");
            countLine++;
            String[] tokens = linea.split(" ");
            countWords += tokens.length;
            for (String word : tokens)
                setWords.add(word);
        }
        return setWords;
    }
    public static Map<String, Integer> createMaps(String path) throws FileNotFoundException {
        Set<String> setWords   = SetUtils.setWords(path);
        List<String> listWords = listWords(path);
        Map<String, Integer> mapWords = new TreeMap<>();
        for (String word : setWords) {
           int frecuency = Collections.frequency(listWords, word);
           mapWords.put(word, frecuency);
        }
        return mapWords;
    }
    //solicitamos el  numero de datos
    //recepcionamos los datos
    //relleanamos el map
    //devolvemos el map
    public static Map<String, String > createPhoneList() {
        Map<String, String> mapPhoneList = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de contactos");
        int numberOfContacts = scanner.nextInt();
        for (int i = 0; i < numberOfContacts; i++) {
            System.out.println("Introduce teléfono:");
            String phoneNumber = scanner.next();
            System.out.println("Introduce nombre completo");
            String name =  scanner.nextLine();
            mapPhoneList.put(phoneNumber, name);
        }
        return mapPhoneList;
    }
    public static void main(String[] args) throws FileNotFoundException {
        /*Map<String, Integer> mapWords = createMaps("ficheros/texto.txt");
        System.out.println(mapWords);*/
        Map<String, String> mapPhoneList = createPhoneList();
        System.out.println(mapPhoneList);

    }



}







