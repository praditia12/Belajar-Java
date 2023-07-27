package generic.application;

import generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Adit");
        // doIt(stringMyData); //ERORR
        // MyData<Object> objectMyData = stringMyData; // ERORR

        MyData<Object> objectMyData = new MyData<>(200);
        // MyData<Integer> integerMyData = objectMyData; // ERORR

        // MyData<Integer> integerMyData = objectMyData; // ERORR
    }

    public static void doIt(MyData<Object> objectMyData){
        // do Nothing
    }
    public static void doItInteger(MyData<Integer> integerMyData){
        // do Nothing
    }

}
