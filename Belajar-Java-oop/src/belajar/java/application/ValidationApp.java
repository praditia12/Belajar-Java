package belajar.java.application;

import belajar.java.data.LoginRequest;
import belajar.java.error.ValidationEception;
import belajar.java.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("null","9");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Valid");
        }catch (ValidationEception | NullPointerException e){
            System.out.println("Tidak Valid: " + e.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");

    }
}
