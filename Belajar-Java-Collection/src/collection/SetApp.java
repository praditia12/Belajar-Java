package collection;

import java.util.*;

public class SetApp {
    public static void main(String[] args) {

        // Set digunakan dimana semua item uniqe tidak ada yg duplikat
        /*
            hashSet memungkinkan item tidak berurutan
            LinkedSet menjamin item berurutan
        */

        // Set<String> hashSet = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.addAll(List.of("Arif","Ahmad", "Ariel","Aku","Arif","Adit"));

        linkedSet.add("Air");

        /* Immutable Set */
        linkedSet = Collections.unmodifiableSet(linkedSet);

        // linkedSet.add("Array");

        for (var show : linkedSet){
            System.out.println(show);
        }
    }
}
