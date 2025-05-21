import java.util.Arrays;
import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        // accept number of days a book is overdue

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days book is overdue: ");
        int daysOverDue = scanner.nextInt();
        double totalFine = 0;

        /*
        * calculate fine:
        * $0.50 per day for the first 7 days
        * $1 per day for the next 7 days
        * $5 per day after 14 days
        */
        if (daysOverDue <= 0) {
            totalFine = 0.0; // No fine if not overdue or returned early
            System.out.println("No fine. The book is not overdue.");
        } else if (daysOverDue <= 7) {
            // Fine for the first 7 days
            totalFine = daysOverDue * 0.50;
        } else if (daysOverDue <= 14) {
            // Fine for the first 7 days (0.50 per day)
            totalFine = (7 * 0.50);
            // Fine for the days beyond 7 up to 14 (1.00 per day)
            totalFine += (daysOverDue - 7) * 1.00;
        } else {
            // Fine for the first 7 days (0.50 per day)
            totalFine = (7 * 0.50);
            // Fine for the next 7 days (days 8-14, 1.00 per day)
            totalFine += (7 * 1.00);
            // Fine for days after 14 (5.00 per day)
            totalFine += (daysOverDue - 14) * 5.00;
        }

        // print total fine
        if (daysOverDue > 0) {
            System.out.printf("Total Fine for %d days is : $%.2f\n ", daysOverDue, totalFine);
        }
    }
}
