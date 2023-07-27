package lambda.app.javaUtilFunc;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "null";

        System.out.println(supplier.get());

        /** digunakan ketika membutuhkan return tanpa memasukan params **/

    }
}
