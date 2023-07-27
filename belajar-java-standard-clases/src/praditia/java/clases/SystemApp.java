package praditia.java.clases;

public class SystemApp {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("LOCALAPPDATA"));

        System.gc();

        System.out.println("Running");

        System.exit(0);

        System.out.println("Not Running");

    }
}
