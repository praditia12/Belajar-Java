package lambda.app.javaUtilFunc;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        Predicate<String> chekIsBlank = s -> s.isBlank();

        System.out.println(chekIsBlank.test(""));
        System.out.println(chekIsBlank.test("You"));

        /** digunakan ketika ingin menggunakan bereturn boolean **/

    }
}
