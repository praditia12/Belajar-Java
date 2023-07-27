package lambda.app.javaUtilFunc;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        Consumer<String> consumer = value -> System.out.println(value);

        consumer.accept("Hai");

        /** digunakan ketika ingin menggunakan lambda untuk menerima data **/

    }
}
