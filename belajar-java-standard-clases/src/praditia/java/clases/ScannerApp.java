package praditia.java.clases;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.print("Umur : ");
        Integer age = scanner.nextInt();

        System.out.println("Nama kamu " +name + " sDan umur kamu " +age +" Tahun");

    }
}
