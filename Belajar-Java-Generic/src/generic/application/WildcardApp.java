package generic.application;

import generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(9999));
        print(new MyData<String>("9999"));
        print(new MyData<Boolean>(false));
    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }

}
