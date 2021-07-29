import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!\n");
        System.out.println("Supported requests:\n - enter a natural number to know it's properties;");
        System.out.println("- enter 0 to exit.");
        long naturalNumber = 1;

        while (naturalNumber != 0) {
            System.out.print("Enter a request: ");
            naturalNumber = scanner.nextLong();

            if (naturalNumber < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
            } else if (naturalNumber == 0){
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("The Properties of " + naturalNumber);
                getEvenOdd(naturalNumber);
                getBuzz(naturalNumber);
                getDuck(naturalNumber);
                getPalindromic(naturalNumber);
            }
        }
    }

    public static void getEvenOdd (long naturalNumber) {
        System.out.println(naturalNumber % 2 == 0 ? "        even: true\n        odd: false" : "        even: false\n        odd: true");
    }

    public static void getBuzz (long naturalNumber) {
        System.out.println(naturalNumber % 7 == 0 || naturalNumber % 10 == 7 ? "        buzz: true" : "        buzz: false");
    }

    public static void getDuck (long naturalNumber) {
        System.out.println(String.valueOf(naturalNumber).contains("0") ? "        duck: true" : "        duck: false");
    }

    public static void getPalindromic (long naturalNumber) {
        long temp = naturalNumber;
        long sum = 0;
        long remainder = 0;

        while (naturalNumber > 0) {
            remainder = naturalNumber % 10;
            sum = (sum * 10) + remainder;
            naturalNumber = naturalNumber / 10;
        }
        if (temp == sum) {
            System.out.println("palindromic: true");
        } else {
            System.out.println("palindromic: false");
        }
    }
}