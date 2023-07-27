package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(500);

        for (var i = 1; i < 500; i++ ){
            list.add(i);
        }

        int index = Collections.binarySearch(list, 66);

        System.out.println(index);
    }
}
