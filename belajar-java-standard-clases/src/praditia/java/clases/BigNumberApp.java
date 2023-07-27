package praditia.java.clases;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("2000000000000000000000");
        BigInteger b = new BigInteger("5000000000000000000000");

        BigInteger c = a.add(b);

        System.out.println(c);

    }
}
