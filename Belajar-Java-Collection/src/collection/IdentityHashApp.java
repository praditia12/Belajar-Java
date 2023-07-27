package collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashApp {
    public static void main(String[] args) {

        Map<String, String> map = new IdentityHashMap<>();
        // Map<String, String> map = new HashMap<>();

        String key1 = "name.first";
        String name = "name";
        String first = "first";
        String dot = ".";
        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "Adit");
        map.put(key2, "Adit");

        System.out.println(map.size());



    }
}
