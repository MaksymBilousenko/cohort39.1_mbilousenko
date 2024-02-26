package Lesson41;

public class Main04 {
    public static void main(String[] args) {
        String regex;
        regex = "hello";
        System.out.println("hello".matches(regex));
        System.out.println("goodbye".matches(regex));

        regex = "[123hello]";
        System.out.println("12".matches(regex));
        System.out.println("o".matches(regex));
        System.out.println();

        regex = "[^abc]";
        System.out.println("a".matches(regex));
        System.out.println("!".matches(regex));
        System.out.println();

        regex = "";
        System.out.println("".matches(regex));
        System.out.println("".matches(regex));
        System.out.println();
        

    }
}
