public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Praditia");
        sayHello("Adit", "Praditia");

    }

    static void sayHello (){
        System.out.println("Hello");
    }
    static void sayHello (String nama){
        System.out.println("Hello "+ nama);
    }
    static void sayHello (String firstName,String lastName ){
        System.out.println("Hello "+ firstName + " "+ lastName);
    }

}
