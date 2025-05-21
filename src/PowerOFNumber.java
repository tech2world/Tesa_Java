import java.util.Scanner;

public class PowerOFNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Power Calculator ---");

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent (a non-negative integer): ");
        int exponent = scanner.nextInt();

        // Validate exponent
        if (exponent < 0) {
            System.out.println("Exponent cannot be negative for this calculation. Please enter a non-negative integer.");
        } else {
            double result = 1.0; // Initialize result to 1 (any number to the power of 0 is 1)

            // Calculate power using a loop
            // If exponent is 0, the loop won't run, and result remains 1.0, which is correct.
            for (int i = 0; i < exponent; i++) {
                result *= base; // Multiply result by base 'exponent' number of times
            }

            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }

        scanner.close();
    }
}
