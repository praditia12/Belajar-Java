package belajar.java.application;

import belajar.java.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginrequest = new LoginRequest("Adit", "secret");

        System.out.println(loginrequest.username());
        System.out.println(loginrequest.password());
        System.out.println(loginrequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Praditia"));
        System.out.println(new LoginRequest("Ptrtrt", "apa"));
    }
}
