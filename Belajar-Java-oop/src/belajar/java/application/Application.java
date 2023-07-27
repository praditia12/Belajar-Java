package belajar.java.application;

import belajar.java.data.*; // Gunakan * untuk mengimport semua package atau class
// import java.lang.*; // semua class yang berada di java.lang semua sudah auto import

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Lenovo ThinkBook", 6_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        Program program = new Program();
    }

}
