package belajar.java.util;

import belajar.java.annotation.NotBlank;
import belajar.java.data.LoginRequest;
import belajar.java.error.BlankException;
import belajar.java.error.ValidationEception;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validate (LoginRequest loginRequest) throws ValidationEception,NullPointerException{
        if (loginRequest.username() == null){
            throw new NullPointerException("username not null");
        }else if (loginRequest.username().isBlank()){
            throw new ValidationEception("username kosong!");
        }else if (loginRequest.password()== null){
            throw new NullPointerException("password not null");
        }else if (loginRequest.password().isBlank()){
            throw new ValidationEception("password kosong!");
        }
    }

    public static void validateRuntime (LoginRequest loginRequest) {
        if (loginRequest.username() == null){
            throw new NullPointerException("username not null");
        }else if (loginRequest.username().isBlank()){
            throw new BlankException("username kosong!");
        }else if (loginRequest.password()== null){
            throw new NullPointerException("password not null");
        }else if (loginRequest.password().isBlank()){
            throw new BlankException("password kosong!");
        }
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields){
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class)!= null) {
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + "Is Blank");
                    }
                } catch (IllegalAccessException exception){
                    System.out.println("Tidak Bisa Mengakses Field " + field.getName());
                }
            }
        }

    }

}
