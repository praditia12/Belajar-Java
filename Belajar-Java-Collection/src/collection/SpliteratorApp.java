package collection;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {

        List<String> list = List.of("Adit", "Praditia","Rahayu", "Naruto", "Boruto", "Madara");

        Spliterator<String> spliterator =  list.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();

        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator2.estimateSize());

        spliterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
