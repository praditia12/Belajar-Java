package belajar.java.application;

import belajar.java.data.CreateUserRequest;
import belajar.java.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Adit");
        request.setPassword("Adit");

        ValidationUtil.validationReflection(request);

    }
}
