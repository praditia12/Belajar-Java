package generic.application;

import generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("A-Z");
        // objectMyData.setData(1000);

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());

    }

    public static void process(MyData<? super String> myData){

        Object value = myData.getData();
        System.out.println("Proses parameter " + value);

        myData.setData("Z-A");

    }

}
