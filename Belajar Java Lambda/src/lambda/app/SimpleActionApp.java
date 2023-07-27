package lambda.app;

import lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        /** SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action() {
                return "FollowUp";
            }
        };

        System.out.println(simpleAction.action());

        SimpleAction simpleAction2 = () -> {
            return "only You";
        };

        System.out.println(simpleAction2.action()); **/

        SimpleAction simpleAction1 = (String age) -> {
            return "your Age" + age;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "your Name" + name + ", Right?";
        };

        SimpleAction simpleAction3 = (String hobbies) -> "and your Hobby" + hobbies;
        SimpleAction simpleAction4 = (hobbies) -> "Yes, My Hobby" + hobbies;
        SimpleAction simpleAction5 =  hobbies -> "and you?, My hobbies " + hobbies;

    }
}
