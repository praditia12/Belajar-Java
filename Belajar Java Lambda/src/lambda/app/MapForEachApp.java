package lambda.app;

import java.util.HashMap;
import java.util.Map;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<Integer, String> listName = new HashMap<>();

        listName.put(1, "Adit");
        listName.put(2, "Robi");
        listName.put(3, "Zaki");

        // lambda
        listName.forEach((key, value) -> System.out.println(key + ". " + value));

    }
}
