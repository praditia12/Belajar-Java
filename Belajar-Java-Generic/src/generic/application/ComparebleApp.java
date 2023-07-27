package generic.application;

import generic.util.Person;

import java.util.Arrays;

public class ComparebleApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Adit", "Subang"),
                new Person("Budi", "Jakarta"),
                new Person("Joko", "Subang"),
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
