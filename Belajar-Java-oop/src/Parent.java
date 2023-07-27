class Parent {
    String name;
    void doIt(){
        System.out.println("Do it Parent");
    }
}

class Child extends Parent {
    String name;
    void doIt(){
        System.out.println("Do it Child");
        System.out.println("Parent name is " + super.name);
    }
}