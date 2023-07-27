package generic.application;

import generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {
            "Adit", "Heiwa", "Rigan"
        };

        Integer[] number = {
                1,2,3,4,5,6,7,8,9
        };

        System.out.println(
                ArrayHelper.<String>count(names)
        ); // Add <String> Opsional

        System.out.println(
                ArrayHelper.count(number)
        ); //

    }
}
