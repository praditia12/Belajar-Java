package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Adit");
        collection.addAll(List.of("Praditia","Alian","Ramdani","Eko"));

        for (var name: collection) {
            System.out.println(name);
        }

        System.out.println("=======================");

        collection.remove("Eko");
        collection.removeAll(List.of("Ramdani", "Adit"));

        for (var name: collection) {
            System.out.println(name);
        }

//        cara mengecek collection ada atau tidak
        System.out.println(
                collection.contains("Praditia")
        );

//        contoh mengecek data yang tidak ada
        System.out.println(
                collection.contains("Eko")
        );
    }
}
