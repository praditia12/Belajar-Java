package belajar.java.data;

public class Category {

    private String id;

    private boolean expensive;

    public String getId() { // getxx untuk mengambil getter method
        return id;
    }

    public void setId(String id) { // setxx untuk mengubah setter method
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
