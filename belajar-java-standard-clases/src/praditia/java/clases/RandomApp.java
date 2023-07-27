package praditia.java.clases;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int value = random.nextInt(50);
            System.out.println(value);
        }

    }
}
