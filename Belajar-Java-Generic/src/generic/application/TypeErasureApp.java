package generic.application;

import generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Adit");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();

    }
}
