package collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> stringList = new Vector<>();

        stringList.add("satu");
        stringList.add("dua");
        stringList.add("tiga");

        for (var list : stringList){
            System.out.println(list);
        }

    }
}
