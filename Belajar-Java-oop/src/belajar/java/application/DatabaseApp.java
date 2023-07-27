package belajar.java.application;

import belajar.java.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Adit", null);
        System.out.println("Sukses");
    }

    public static void connectDatabase (String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak Bisa Connect DataBase");
        }
    }
}
