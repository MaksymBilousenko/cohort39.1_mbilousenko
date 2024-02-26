package Lesson41;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();


        if (new StringBuilder(s).reverse().toString().equals(s)) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Is not palindrome");
        }
        String s1 = scanner.nextLine().toLowerCase();
        System.out.println(new StringBuilder(s1).reverse().toString().equals(s1) ? "Is palindrome" : "Is not palindrome");
    }
}
