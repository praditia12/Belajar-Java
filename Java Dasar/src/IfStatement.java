public class IfStatement {
    public static void main(String[] args) {

        int kehadiran = 50;
        int kompetensi = 90;

        float avgTotal = kehadiran + kompetensi;

        avgTotal/=2;

        if (avgTotal >= 88){
            System.out.println("Nilai Anda Sangat Bagus");
        }else if (avgTotal >= 75 && avgTotal <= 87) {
            System.out.println("Nilai Anda Bagus");
        }else {
            System.out.println("Anda Perlu Remedial");
        }

    }
}
