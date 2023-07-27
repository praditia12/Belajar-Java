package belajar.java.data;

public interface Car extends HasBrand, IsMaintenance{

    void drive();

    int inTier();

    default boolean isBig(){ // default method = opsi
        return false;
    }

}
