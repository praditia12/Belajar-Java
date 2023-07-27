package belajar.java.data;

public class Bus implements Car{
    public void drive() {
        System.out.println("Bus drive");
    }

    public int inTier() {
        return 8;
    }

    public String getBrand() {
        return "Mercedez Benz";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
