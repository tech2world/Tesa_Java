import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Factorial Calculator ---");
        System.out.print("Enter a non-negative integer to calculate its factorial: ");

        // Read the number from the user
        int n = scanner.nextInt();

        // Validate input
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorialResult = calculateFactorial(n);
            System.out.println("The factorial of " + n + " is: " + factorialResult);
        }

        scanner.close();
    }

    private static long calculateFactorial(int n) {
        // Base case: Factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        long result = 1;
        // Multiply numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
