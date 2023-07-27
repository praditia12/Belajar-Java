package generic.application;

import generic.MyData;

public class MyDataApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Subang");
        MyData<Integer> integerMyData = new MyData<Integer>(30);

        String stringValue = stringMyData.getData();
        Integer intValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(intValue);

    }
}
