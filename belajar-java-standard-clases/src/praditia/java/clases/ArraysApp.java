package praditia.java.clases;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {
          1,2,3,4,5,6,7,9,0,11,23,44,22,55,11,333,1111,789
        };

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,9));
        System.out.println(Arrays.binarySearch(numbers,333));
        System.out.println(Arrays.binarySearch(numbers,500));

        int[] result = Arrays.copyOf(numbers,8);
        System.out.println(Arrays.toString(result));

        int[] resultTo = Arrays.copyOfRange(numbers,3,9);
        System.out.println(Arrays.toString(resultTo));
    }
}
