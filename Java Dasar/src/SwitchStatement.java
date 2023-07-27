public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Sangat Baik");
                break;
            case "B":
            case "C":
                System.out.println("Baik");
                break;
            case "D":
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Lebih Semangat Lagi Belajar nya!!!!");
        }

        // Switch Lambda
        switch (nilai){
            case "A" -> System.out.println("Sangat Baik");
            case "B", "C" -> System.out.println("Baik");
            case "D" -> System.out.println("Kurang");
            default -> {
                System.out.println("Lebih Semangat Lagi Belajar nya!!!!");
            }
        }

        String ucapan;

        switch (nilai){
            case "A" -> ucapan = "Sangat Baik";
            case "B", "C" -> ucapan = "Baik";
            case "D" -> ucapan = "Kurang";
            default -> {
                ucapan = "Lebih Semangat Lagi Belajar nya!!!!";
            }
        }
        System.out.println(ucapan);

        ucapan = switch (nilai){
            case "A":
              yield "Sangat Baik";
            case "B","C":
                yield "Baik";
            case "D":
                yield "Kurang";
            default:
                yield "Lebih Semangat Lagi Belajar nya!!!!";
        };
        System.out.println(ucapan);
    }
}
