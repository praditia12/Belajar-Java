package belajar.java.application;

import belajar.java.annotation.fancy;
import belajar.java.data.Animal;
import belajar.java.data.Cat;


@fancy(name = "Animal Application", tags = {"Perawatan hewan", "AnimalFood"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Meow";
        animal.run();

    }
}
