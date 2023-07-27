package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("8rfjf");
        strings.addAll(List.of("U4","7bmvmv","jfjfnffj"));

        System.out.println("============");
        System.out.println(strings.get(3));
        System.out.println("============");

        strings.set(0, "Aku");

        for (var apaaja : strings){
            System.out.println(apaaja);
        }
    }
}
