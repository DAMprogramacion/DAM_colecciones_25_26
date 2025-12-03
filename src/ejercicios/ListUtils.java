package ejercicios;

import java.util.*;

public class ListUtils {
    public static List<String> getSortListOfName() {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String name = "";
        do {
            System.out.println("Introduce nombre, teclea FIN para terminar");
            name = scanner.nextLine();
            names.add(name);
        } while (! name.equalsIgnoreCase("FIN"));
        scanner.close();
        //System.out.println(names);
        names.removeLast();//names.remove(names.size() -1);
        //System.out.println(names);
        Collections.sort(names);
        return names;
    }
    public static  void removEvens(List<Integer> list){
        for (int i = 0; i < list.size(); i++)
              if (list.get(i) % 2 == 0)
                list.remove(i);
    }
    public static List<Integer> reverseList (List<Integer> list){
        List<Integer> reverseL = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0 ; i--) {
            reverseL.add(list.get(i));
        }
        return reverseL;
    }
    public static List<Integer> getCommonsItems(List<Integer> list1, List<Integer> list2){
        Set<Integer> commonList = new HashSet<>();
        for (int number : list1){
            if (list2.contains(number)){
                commonList.add(number);
            }
        }
        return new ArrayList<>(commonList);
    }
    public static void main(String[] args) {
       // List<String> names = getSortListOfName();
       // System.out.println(names);
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 4, 5, 6));
        System.out.println(numbers);
       // removEvens(numbers);
       // System.out.println(numbers);
        System.out.println(reverseList(numbers));
        List<Integer> numbers1 = new ArrayList<>(List.of(1, 2, 3, 4, 9, 8, 80));
        System.out.println(getCommonsItems(numbers, numbers1));

    }
}
