package lambda.app;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("adit");
        sayHello(null);
    }

    public static void sayHello(String name){
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());

        optionalNameUpper.ifPresentOrElse
                (name1 -> System.out.println("HELLO " + name1),
                        () -> System.out.println("HELLO"));
    }

}
