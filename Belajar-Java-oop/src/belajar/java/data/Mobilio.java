package belajar.java.data;

public class Mobilio implements Car{

   public void drive() {
        System.out.println("Mobilio drive");
    }

    public int inTier() {
        return 4;
    }

    public String getBrand() {
        return "Honda";
    }

    public boolean isMaintenance() {
        return false;
    }
}
