public class OperasiBoolean {
    public static void main(String[] args) {

        int nilaikehadiran = 74;
        int nilaikompetensi = 88;

        boolean nilaiakhirkehadiran = nilaikehadiran >= 75;
        boolean nilaiakhirkompetensi = nilaikompetensi >= 75;

        var lulus = nilaiakhirkehadiran && nilaiakhirkompetensi;
        System.out.println(lulus);

        // && = Dan
        // || = Atau
        // ! = Kebalikan



    }

}
