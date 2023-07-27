package belajar.java.data;

public class Application {

    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses Class Prosesors");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
