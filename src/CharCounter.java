import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("--- Character Counter ---");

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        // Read the character. We take a string and get its first character.
        // This handles cases where user might accidentally type more than one char.
        char charToCount = scanner.nextLine().charAt(0);

        // Call the function to count the character occurrences
        int count = countCharOccurrences(inputString, charToCount);

        System.out.println("The character '" + charToCount + "' appears " + count + " time(s) in the string.");

        scanner.close();
    }

    private static int countCharOccurrences(String text, char targetChar) {
        int count = 0;

        // Handle null input
        if (text == null || text.isEmpty()) {
            return 0;
        }

        // Iterate through each character of the input string
        for (int i = 0; i < text.length(); i++) {
            // Get the character at the current position
            char currentChar = text.charAt(i);

            // Check if the current character matches the target character
            if (currentChar == targetChar) {
                count++; // Increment the counter if there's a match
            }
        }
        return count;
    }
}
