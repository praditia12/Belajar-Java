package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (var i = 1; i <= 10; i++ ){
            list.add(i);
        }

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);


    }
}
