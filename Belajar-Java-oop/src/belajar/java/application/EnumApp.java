package belajar.java.application;

import belajar.java.data.Customer;
import belajar.java.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer cutomer = new Customer();

        cutomer.setName("Budi");
        cutomer.setLevel(Level.VIP);

        System.out.println(cutomer.getName());
        System.out.println(cutomer.getLevel());
        System.out.println(cutomer.getLevel().getDescription());

        String levelName = Level.PREMIUM.name(); // Mengambil nama enum
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD"); // Konversi String jadi Enum
        System.out.println(level);

        System.out.println("Opsi Level"); // Print Semua Opsi Enum
        for (var value : Level.values()){
            System.out.println(value);
        }
    }
}
