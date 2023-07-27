package collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<Integer> numbers = List.of(34,76,55,33,666,33324,135,89);

        for ( var number : numbers){
            System.out.println(number);
        }

        Iterator iterator = numbers.iterator();

        while (iterator.hasNext()){
            var number = iterator.next();
            System.out.println(number);
        }

    }
}
