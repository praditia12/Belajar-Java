package praditia.java.clases;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Adit");
        builder.append(" ");
        builder.append("Praditia");

        String name = builder.toString();
        System.out.println(name);

    }
}
