import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Prime Factor Finder ---");
        System.out.print("Enter a positive integer to find its prime factors: ");

        // Read the number from the user
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (number == 1) {
            System.out.println("The number 1 has no prime factors.");
        } else {
            // Call the function to find prime factors
            List<Integer> primeFactors = findPrimeFactors(number);

            System.out.println("Prime factors of " + number + " are: " + primeFactors);
        }

        scanner.close();
    }


    private static List<Integer> findPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        // Handle factor 2
        // Continuously divide by 2 as long as it's divisible
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Handle odd factors
        // Iterate from 3 up to the square root of n (inclusive), incrementing by 2 (only odd numbers)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // Continuously divide by i as long as it's divisible
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // If n is still greater than 1 after the loop, it means the remaining n is a prime factor itself
        // This handles cases where the number itself is a prime (e.g., 7, 13)
        // or the largest prime factor is greater than its square root (e.g., 26 -> 2, 13)
        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }
}
