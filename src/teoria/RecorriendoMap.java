package teoria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RecorriendoMap {
    public static void main(String[] args) {
        //diccionario dni -> nombre
        Map<String, String> data = Map.of("12345678a", "julian", "12345679b", "esperanza",
                "12345670c", "felisa", "12345671d", "emilio");
        System.out.println(data);
        Set<String> keys = data.keySet();
        System.out.println(keys);
        for (String key : keys) {
            //dni: 12345678a -> JULIAN
            System.out.printf("dni: %s -> %S%n", key, data.get(key));
        }
    }
}
