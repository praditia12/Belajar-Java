public class MethodVariableArgument {
    public static void main(String[] args) {

        // Tanpa Variable Argument
        int [] values = {90,90,40};
        sayCongrats("Adit", values);

        // Menggunakan Variable Argument
        sayCongrats("Aldi",80,90,70,90,90);


    }

    static void sayCongrats (String name, int... values){
        int total = 0;

        for (var value : values){
            total += value;
        }

        int finalValue = total / values.length;

        var hasil = finalValue >= 75 ? "Selamat "+ name + ", Anda Lulus" : "Maaf "+ name + ", Anda Belum Lulus";

        System.out.println(hasil);

        /*
        if (finalValue >= 75) {
            System.out.println("Selamat "+ name + ", Anda Lulus");
        }else {
            System.out.println("Maaf "+ name + ", Anda Belum Lulus");
        }
        */

    }

}
