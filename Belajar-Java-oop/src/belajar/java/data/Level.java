package belajar.java.data;

public enum Level {
    STANDARD("Biasa"),
    PREMIUM("Luar Biasa"),
    VIP ("Sangat Luar Biasa");

    private String description;

    Level(String description){
        this.description =description;
    }

    public String getDescription() {
        return description;
    }
}
