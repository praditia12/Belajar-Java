public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Adit", "Subang");

        System.out.println(person1.name);
        System.out.println(person1.addres);
        System.out.println(person1.country);

        person1.sayHello("Lulu");

        Person person2 = new Person("Joko");

        Person person3;
        person3 = new Person();

        System.out.println(person3.hasilTambah(12,9));
    }
}
