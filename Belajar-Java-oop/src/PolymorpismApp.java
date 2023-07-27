public class PolymorpismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Adit");
        employee.sayHello("Budi");

        employee = new Manager("Arif");
        employee.sayHello("Badi");

        employee = new VicePresident("Joko");
        employee.sayHello("Jaki");

        sayHello(new Employee("Heiwa"));
        sayHello(new Manager("Lulu"));
        sayHello(new VicePresident("Rigan"));

    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VicePresident " + employee.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + employee.name);
        } else {
            System.out.println("Hello " + employee.name);
        }

    }

}
