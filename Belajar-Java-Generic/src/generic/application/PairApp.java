package generic.application;

import generic.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<Integer, String>(17, "Adit");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}
