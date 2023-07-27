package belajar.java.application;

import belajar.java.data.City;
import belajar.java.data.Location;

public class ApplicationApp {
    public static void main(String[] args) {
        // var location = new Location(); ERROR karena abtract class
        var city = new City();
        city.name= "Subang";

        System.out.println(city.name);
    }
}
