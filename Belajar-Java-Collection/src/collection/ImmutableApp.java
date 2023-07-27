package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        /* Membuat data menjadi Immutable */

        // singletonList  .membuat satu data immutable
        List<String> satuAja = Collections.singletonList("1");
        // emptyList  .membuat data immutable kosong
        List<String> empty = Collections.emptyList();

        // unmodifiableList  .membuat data List yg dipilih menjadi immutable
        List<String> mutable = new ArrayList<>();
        mutable.add("satu");
        mutable.add("sate");
        mutable.add("sita");
        List<String> immutable = Collections.unmodifiableList(mutable);

        // membuat data immutable lngsung
        List<String> element = List.of("jjj","iiii","uuu");

    }
}
