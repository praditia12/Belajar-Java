package lambda.app.javaUtilFunc;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        Function<String, Integer> valueLenght = value -> value.length();

        System.out.println(valueLenght.apply("Banyak"));

        /** digunakan ketika membutuhkan parameter dan return Value **/

    }
}
