package numbers; // List of numbers
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a natural number:");
        int naturalNumber = scanner.nextInt();
        
        if (naturalNumber <= 0) {
            System.out.println("This number is not natural!");
        } else {
            System.out.println(naturalNumber % 2 == 0 ? "This number is Even."
                : "This number is Odd.");
            System.out.println(naturalNumber % 7 != 0 && naturalNumber % 10 != 7 ? "It is not a Buzz number.\n Explanation: "
                + naturalNumber + " is neither divisible by 7 nor does it end with 7."
                : naturalNumber % 7 == 0 && naturalNumber % 10 != 7 ? "It is a Buzz number.\n Explanation: "
                    + naturalNumber + " is divisible by 7."
                    : naturalNumber % 7 != 0 && naturalNumber % 10 == 7 ? "It is a Buzz number.\n Explanation: "
                        + naturalNumber + " ends with 7"
                        : naturalNumber % 7 == 0 && naturalNumber % 10 == 7 ? "It is a Buzz number. \n Explanation: "
                            + naturalNumber + " is divisible by 7 and ends with 7."
                            : "This number is not natural!");
        }
    }
}
