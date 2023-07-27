public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b); //sisa bagi

        //augmented assignments
        int c = 100;

        c+=10;
        System.out.println(c);

        c-=10;
        System.out.println(c);

        c*=10;
        System.out.println(c);

        //Unary Operator
        int d = 230;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!(true));

    }

}
