package collection;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("1", "A");
        sortedMap.put("4", "D");
        sortedMap.put("2", "B");
        sortedMap.put("3", "C");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

        // empty.put("2", "mm"); erorr
        // empty.put("rgr", "mkmb");erorr


    }
}
