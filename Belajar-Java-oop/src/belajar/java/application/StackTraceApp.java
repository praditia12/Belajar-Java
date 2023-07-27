package belajar.java.application;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            sampleErorr();
        }catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    public static void sampleErorr() {

        try {
            String[] names = {
                    "Adit", "Praditia", "Ganteng"
            };

            System.out.println(names[50]);
        }catch (Throwable trowable){
            throw new RuntimeException(trowable);
        }

    }
}
