package collection;

import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new java.util.HashMap<>();

        map.put("baju", "Erigo");
        map.put("covid", "Masker");
        map.put("belalai", "Gajah");

        System.out.println(map.get("belalai"));

    }
}
