package lambda.app;

import lambda.util.StringUtil;

import java.util.function.Predicate;

public class MethodRefenceApp {
    public static void main(String[] args) {

//        Predicate<String> predicate = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicate = StringUtil::isLowerCase;

        System.out.println(predicate.test("Add"));
        System.out.println(predicate.test("add"));
    }

    public void run(){
        Predicate<String> predicateisLowercase = this::isLowerCase;

        System.out.println(predicateisLowercase.test("Add"));
        System.out.println(predicateisLowercase.test("add"));
    }

    public void run2(){
        MethodRefenceApp app = new MethodRefenceApp();

        Predicate<String> predicateisLowercase = app::isLowerCase;

        System.out.println(predicateisLowercase.test("Add"));
        System.out.println(predicateisLowercase.test("add"));
    }

    public boolean isLowerCase(String value){
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c))
                return false;
        }
        return true;
    }

}
