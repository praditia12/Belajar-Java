package praditia.java.clases;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {

        String name = "Adit 435522 Praditia";

        String encoded = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(encoded);

        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);

        System.out.println(result);


    }
}
