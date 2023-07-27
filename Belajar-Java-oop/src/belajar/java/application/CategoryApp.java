package belajar.java.application;

import belajar.java.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("0045672");
        category.setId(null);

        System.out.println(category.getId());
    }
}
