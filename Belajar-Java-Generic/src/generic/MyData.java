package generic;

public class MyData<T> {

    public MyData(T data) {
        this.data = data;
    }

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
