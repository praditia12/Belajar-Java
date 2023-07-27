package belajar.java.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Adit";
        first = first + " " + "praditia";

        System.out.println(first);

        String second = "Adit praditia";

        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Adit praditia";

        System.out.println(third == second);
        System.out.println(third.equals(second));

    }
}
