import java.util.InputMismatchException;
import java.util.Scanner;

public class Consultation22_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            int number = scanner.nextInt();
            System.out.println("Your number: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
    }
}
