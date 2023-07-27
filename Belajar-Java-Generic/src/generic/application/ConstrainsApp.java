package generic.application;

public class ConstrainsApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(99);
        NumberData<Double> doubleNumberData = new NumberData<>(1.5);

        /* NumberData<String> stringNumberData = new NumberData<String>("King");
         ERORR karena hanya bisa di akses class Number atau child class Number */

    }

    public static class NumberData<T extends Number>{

        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
