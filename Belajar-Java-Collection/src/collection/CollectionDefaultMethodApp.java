package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <=50 ; i++) {
            list.add(i);
        }

        System.out.println(list);

        list.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        });

        System.out.println(list);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 10;
            }
        });

        System.out.println(list);

    }
}
