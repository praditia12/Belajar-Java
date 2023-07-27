package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashApp {
    public static void main(String[] args) {

        /* WeakHashMap menyimpan key secara sementara */
        Map<Integer, Integer> weakHashMap = new WeakHashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            weakHashMap.put(i,i);
        }

        System.gc();

        System.out.println(weakHashMap.size());

    }
}
