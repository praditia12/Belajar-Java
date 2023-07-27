package lambda.app;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of("Adit", "Praditia", "Rahayu"));

        // removeIf Lambda
        list.removeIf(name -> name.length() > 5);

        System.out.println(list);

    }
}
