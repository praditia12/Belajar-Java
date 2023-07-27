package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ToArrayApp {
    public static void main(String[] args) {

        List<String> alfabets = List.of("A","B","C","D","E");

        Object[] arrayObj = alfabets.toArray();
        String[] arrayStr = alfabets.toArray(new String[]{});

        System.out.println(Arrays.toString(arrayObj));
        System.out.println(Arrays.toString(arrayStr));

    }
}
