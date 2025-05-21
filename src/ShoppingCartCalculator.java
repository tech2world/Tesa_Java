import java.util.Scanner;

public class ShoppingCartCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        System.out.println("--- Shopping Cart Calculator ---");
        System.out.println("Please enter the price of 5 items:");

        // Loop to prompt for the price of 5 items
        for (int i = 1; i <= 5; i++) {
            System.out.print("\nEnter price for item " + i + ": $");
            double itemPrice = scanner.nextDouble();

            // Basic validation for item price
            if (itemPrice <= 0) {
                System.out.println("Price cannot be negative. Please enter a valid price.");
                i--; // Decrement i to re-ask for the same item
                continue;
            }
            totalCost += itemPrice; // Add item price to total cost
        }

        System.out.printf("\nTotal cost before discount: #%.2f\n", totalCost);

        double discountPercentage = 0.0;
        double finalCost;

        // Apply discount based on total cost
        if (totalCost > 200) {
            discountPercentage = 0.20; // 20% off
            System.out.println("Applying 20% discount (total exceeds #200).");
        } else if (totalCost > 100) {
            discountPercentage = 0.10; // 10% off
            System.out.println("Applying 10% discount (total exceeds #100).");
        } else {
            System.out.println("No discount applied.");
        }

        // Calculate final cost after discount
        finalCost = totalCost * (1 - discountPercentage);

        System.out.printf("Final cost after discount: #%.2f\n", finalCost);

        scanner.close();
    }
}
