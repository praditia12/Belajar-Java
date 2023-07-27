package praditia.java.clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");

            System.out.println(host);

        }catch (FileNotFoundException exception){
            System.out.println("File Tidak Ditemukan");
        }catch (IOException exception){
            System.out.println("Tidak berhasil Load Data");
        }

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Adit");
            properties.put("name.last", "Praditia");

            properties.store(new FileOutputStream("name.properties"), "Config Nama");
        } catch (FileNotFoundException e) {
            System.out.println("Error Membuat file pro");
        } catch (IOException e) {
            System.out.println("Error Menympan file");
        }

    }
}
