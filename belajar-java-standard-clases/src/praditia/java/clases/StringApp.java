package praditia.java.clases;

public class StringApp {
    public static void main(String[] args) {

        String name = "Adit Praditia";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Adit"));
        System.out.println(name.endsWith("Praditia"));
    }
}
