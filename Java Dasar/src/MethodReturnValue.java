public class MethodReturnValue {
    public static void main(String[] args) {

        System.out.println(sum(200,300));

        System.out.println(operasi(80,"*",23));
        System.out.println(operasi(80,"",23));

    }

    static int sum (int value1, int value2){ //void nya di ganti tipe data retrun value
        var total = value1 + value2;
        return total;
    }

    static int operasi (int value1,String operasi, int value2){ //feedback data
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            default:
                return 0;
        }

    }

}
