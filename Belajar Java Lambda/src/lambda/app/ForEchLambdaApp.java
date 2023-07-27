package lambda.app;

import java.util.ArrayList;
import java.util.List;

public class ForEchLambdaApp {
    public static void main(String[] args) {

        List<String> list = List.of("Yudi", "Yadi", "Budi" , "Jajang");

        // lambda
        list.forEach(value -> System.out.println(value));

        // lambda Method Reference
        list.forEach(System.out::println);

    }
}
