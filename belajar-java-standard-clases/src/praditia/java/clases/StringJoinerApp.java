package praditia.java.clases;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(" | ","[ ", " ]");

        joiner.add("Adit");
        joiner.add("Praditia");
        joiner.add("AVX");
        joiner.add("Morse");

        String value = joiner.toString();
        System.out.println(value);

    }
}
