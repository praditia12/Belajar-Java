package praditia.java.clases;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {

        for (var i = 0 ; i < 50 ; i++){

            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();

            System.out.println(key);
        }

    }
}