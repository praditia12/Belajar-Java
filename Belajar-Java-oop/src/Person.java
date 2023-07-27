class Person {

    String name; //fields
    String addres;
    final String country = "Indonesia";

    /**
     * Contructor Overloading
     */
    Person (String name, String addres){     // Contructor
        this.name = name;
        this.addres = addres;
    }

    Person (String paramName){    // Contructor
        this (paramName, null);
    }

    Person (){   // Contructor
        this (null);
    }

    void sayHello (String name){
        System.out.println("Hello " + name + ", Nama saya " + this.name); // this keyword
    }
/*
    void sayHello (String name){
        System.out.println("Hello " + name + ", Nama saya " + name); // Variable Shadowing 'name'
    }

 */

    Integer hasilTambah (Integer Value1, Integer Value2 ){
        Integer hasil = Value1 + Value2;
        return hasil;
    }

}
