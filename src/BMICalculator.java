import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation = "yes"; // Control variable for the loop

        System.out.println("--- BMI Calculator ---");

        // Loop to allow multiple calculations
        while (continueCalculation.equalsIgnoreCase("yes")) {
            //  Prompt for height and weight
            System.out.print("Enter your height in meters (e.g., 1.75 for 175 cm): ");
            double height = scanner.nextDouble();

            System.out.print("Enter your weight in kilograms (e.g., 70 for 70 kg): ");
            double weight = scanner.nextDouble();

            // Consume the rest of the line after reading the double, to prevent issues with nextLine()
            scanner.nextLine();

            // Basic input validation
            if (height <= 0 || weight <= 0) {
                System.out.println("Height and weight must be positive values. Please try again.");
                System.out.print("Do you want to calculate again? (yes/stop): ");
                continueCalculation = scanner.nextLine();
                System.out.println();
                continue;
            }

// Calculate BMI  --- BMI Formula: weight (kg) / [height (m)]^2 ---
            double bmi = weight / (height * height);

            System.out.printf("\nYour BMI is: %.2f\n", bmi);

            // Health category based on BMI
            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                category = "Normal weight";
            } else if (bmi >= 25 && bmi <= 29.9) {
                category = "Overweight";
            } else { // bmi >= 30
                category = "Obesity";
            }

            System.out.println("Health Category: " + category);

            // Allow multiple calculations until user says "stop"
            System.out.print("\nDo you want to calculate again? (yes/stop): ");
            continueCalculation = scanner.nextLine();
            System.out.println();
        }

        System.out.println("Thank you for using the BMI Calculator. Goodbye!");
        scanner.close();
    }
}
