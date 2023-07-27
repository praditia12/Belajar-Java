package collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigalbeMapApp {
    public static void main(String[] args) {

        NavigableMap<String,String> navigableMap = new TreeMap<>();

        navigableMap.put("Syahrul", "Syahrul");
        navigableMap.put("Adit", "Adit");
        navigableMap.put("Angga", "Angga");
        navigableMap.put("Alian", "Alian");

        for (var nav :navigableMap.keySet()) {
            System.out.println(nav);
        }

        System.out.println("==============================");
        System.out.println(navigableMap.lowerKey("Alian"));
        System.out.println("==============================");
        System.out.println(navigableMap.higherKey("Alian"));
        System.out.println("==============================");

        NavigableMap<String, String> navigableMapDesc = navigableMap.descendingMap();

        for (var navDesc :navigableMapDesc.keySet()) {
            System.out.println(navDesc);
        }

        NavigableMap<String, String> emptyNavMap = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutableNavMap = Collections.unmodifiableNavigableMap(navigableMapDesc);

        // immutableNavMap.put("asdf","dfmf"); erorr

    }
}
