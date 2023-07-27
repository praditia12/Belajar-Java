package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.addAll(List.of(
                "Kagura",
                "Madara",
                "Kirana",
                "Asep"
        ));

        Collections.sort(names);

        for (var value : names) {
            System.out.println(value);
        }

    }
}
