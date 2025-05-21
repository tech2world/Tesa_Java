import java.util.Scanner;

public class FibonacciSeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Fibonacci Series Generator ---");
        System.out.print("Enter the number of terms you want to generate: ");

        // Read the number of terms from the user
        int n = scanner.nextInt();

        // Validate input
        if (n < 0) {
            System.out.println("Number of terms cannot be negative. " +
                    "Please enter a non-negative integer.");
        } else {
            System.out.println("First " + n + " terms of the Fibonacci series:");
            generateFibonacciSeries(n);
        }

        scanner.close();
    }
    // fibonacci genarator function
    private static void generateFibonacciSeries(int n) {
        if (n == 0) {
            System.out.println("No  value for " + n + " element");
        } else if (n == 1) {
            System.out.print("0"); // The first term is 0
        } else { // n >= 2
            int a = 0; // First Fibonacci number
            int b = 1; // Second Fibonacci number

            System.out.print(a + ", " + b); // Print the first two terms

            // Calculate and print the remaining terms
            for (int i = 2; i < n; i++) {
                int nextTerm = a + b; // Calculate the next term
                System.out.print(", " + nextTerm); // Print the next term
                // swap values
                a = b; // Move b to a
                b = nextTerm; // Move nextTerm to b
            }
        }
        System.out.println();
    }
}
