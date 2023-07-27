package belajar.java.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.SortedMap;

public class ReadApp {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
            while (true){
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        }catch (Throwable throwable) {
            System.out.println("Error Membaca File " + throwable.getMessage());
        }

    }
}
