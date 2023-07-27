package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleTron = Collections.singletonMap("belalai", "Gajah");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("hidung", "bekantan");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        mutable.put("RIRI", "RORO");

        Map<String, String> mapOf = Map.of(
                "ngaben", "Bali",
                "sisingaan", "Subang"
        );

        // mapOf.put("apaazza", "Gatau"); erorr

        // empty.put("sfd", "fkfk"); erorr

        // singleTron.put("ffjfk", "kddk");

        System.out.println(mapOf);
        System.out.println(singleTron);

    }
}
