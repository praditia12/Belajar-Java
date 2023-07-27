package lambda.app;

import java.util.function.Supplier;

public class LazyParameterApp {
    public static void main(String[] args) {
        testScore(40, () -> getName());
    }

    public static void testScore (int score, Supplier<String> name){
        if (score > 80){
            System.out.println("Selamat " + name.get() + ",Anda Lulus");
        }else{
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName(){
        System.out.println("di panggil");
        return "Eko";
    }


}
