package generic.application;

import generic.util.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Adit", "Subang"),
                new Person("Budi", "Jakarta"),
                new Person("Joko", "Subang"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
