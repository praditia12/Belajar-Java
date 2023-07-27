public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Praditia");
        manager.sayHello("Rifqi");

        var vp = new VicePresident("Noru");
        vp.sayHello("Kyu");

        System.out.println(manager); // secara tidak langsung manggil manager.toString
        System.out.println(manager.toString());

    }
}
