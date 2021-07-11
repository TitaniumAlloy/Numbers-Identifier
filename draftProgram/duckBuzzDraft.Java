package numbers; // List of numbers and Shortest line of code than any other.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.println("Enter a natural number:");
        int naturalNumber = scanner.nextInt();      
        if (naturalNumber <= 0) {
            System.out.println("This number is not natural!");
        } else {
            System.out.println("The Properties of " + naturalNumber);
            System.out.println(naturalNumber % 2 == 0 ? "        even: true\n        odd: false" : "        even: false\n        odd: true");
            System.out.println(naturalNumber % 7 == 0 || naturalNumber % 10 == 7 ? "        buzz: true" : "        buzz: false");
            System.out.println(String.valueOf(naturalNumber).contains("0") ? "        duck: true" : "        duck: false");
        }
    }
}
