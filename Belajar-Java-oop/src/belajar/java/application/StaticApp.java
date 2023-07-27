package belajar.java.application;

import static belajar.java.data.Application.PROCESSORS;
import static belajar.java.data.Constanst.*; //import static
import belajar.java.data.Country;
import belajar.java.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(2,4,7,6)
        );

        Country.City city = new Country.City();
        city.setName("jakarta");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
