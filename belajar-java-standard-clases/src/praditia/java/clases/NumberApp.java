package praditia.java.clases;

public class NumberApp {
    public static void main(String[] args) {

        Integer intvalue = 100;

        Long longvalue = intvalue.longValue();
        Double doublevalue = intvalue.doubleValue();
        Short shortValue = intvalue.shortValue();

        String contoh = "1.000000";

        //Integer contohInt = Integer.valueOf(contoh); // .valueOf > Object, .parsexxx > Primitif
        Double contohDouble = Double.valueOf(contoh);

        //System.out.println(contohInt);
        System.out.println(contohDouble);

    }
}
