import java.util.Scanner;

public class RestaurantBillSplitter {
    public static void main(String[] args) {
        // accept total bill and number of people dining

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people are dining? : ");
        var numberOfDiners = scanner.nextInt();

        System.out.println("What is the total amount?");
        double totalBill = scanner.nextDouble();


        //allow user specify sharing ratio based on number of diners
        double[] dinersRatio = new double[numberOfDiners];
        double totalRatio = 0;

        System.out.print("\nPlease specify ratio for each person.");
        System.out.println("Example: 0.5, 1, 1.75, 2 e.t.c.");

        // get each diner's ratio
        for (int i = 0; i < numberOfDiners; i++) {
            System.out.print("Enter share for Diner " + (i + 1) + " : ");
            double getRatio = scanner.nextDouble();
            dinersRatio[i] = getRatio;
            totalRatio += getRatio;
        }

        // calculate tip
        double tipPercentage;

        if ( totalBill < 50) {
            tipPercentage = 0.10;
        }
        else if ( totalBill >= 50 && totalBill < 100) {
            tipPercentage = 0.15;
        }
        else {
            tipPercentage = 0.20;
        }

        // show total bill and bill summary
        double totalTipAmount = totalBill * tipPercentage;
        double totalBillWithTip = totalBill + totalTipAmount;

        System.out.println("\n--- Bill Summary ---");
        System.out.printf("Total Bill: $%.2f\n", totalBill);
        System.out.printf("Total Ratio: %.2f\n", totalRatio);
        System.out.printf("Tip Percentage Applied: %.0f%%\n", tipPercentage * 100);
        System.out.printf("Total Tip Amount: $%.2f\n", totalTipAmount);
        System.out.printf("Total Bill (including Tip): $%.2f\n", totalBillWithTip);

        // Check if totalRatio is very close to zero
        if (totalRatio < 0.0001 && totalRatio > -0.0001) {
            System.out.println("Error: Total ratio cannot be zero. Please re-run and enter valid ratios.");
        } else {
            // Calculate the cost per share including the tip
            double costPerRatioWithTip = totalBillWithTip / totalRatio;
            System.out.printf("Cost per Ratio (including Tip): $%.2f\n", costPerRatioWithTip);

            System.out.println("\n--- Individual Payments (including Tip) ---");
            // Calculate and display each diner's final payment
            for (int i = 0; i < numberOfDiners; i++) {
                double payment = dinersRatio[i] * costPerRatioWithTip;
                System.out.printf("Diner %d (Ratio: %.2f) pays: $%.2f\n", (i + 1), dinersRatio[i], payment);
            }
        }
        scanner.close();
    }
}
