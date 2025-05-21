import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Binary to Decimal Converter ---");
        System.out.print("Enter a binary number (e.g., 001010,10110): ");

        String binaryString = scanner.nextLine();

        // Validate if the input is a valid binary string
        if (!isValidBinary(binaryString)) {
            System.out.println("Invalid input: Please enter a string containing only '0's and '1's.");
        } else {
            // Convert binary string to decimal
            int decimalNumber = convertBinaryToDecimal(binaryString);
            System.out.println("Decimal equivalent: " + decimalNumber);
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }

    private static boolean isValidBinary(String binaryString) {
        // Check if the string is empty
        if (binaryString == null || binaryString.isEmpty()) {
            return false;
        }
        // Iterate through each character to validate it's '0' or '1'
        for (char ch : binaryString.toCharArray()) {
            if (ch != '0' && ch != '1') {
                return false; // Found a character that is not '0' or '1'
            }
        }
        return true;
    }

    private static int convertBinaryToDecimal(String binaryString) {
        int decimal = 0;
        int power = 0; // power of 2 (2^0, 2^1, 2^2, ...)

        // Loop through the binary string from right to left
        // This is because the rightmost digit corresponds to 2^0, the next to 2^1, and so on.
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char bitChar = binaryString.charAt(i);

            // Convert the character '0' or '1' to its integer value (0 or 1)
            int bit = Character.getNumericValue(bitChar);

            // Add the value of the bit multiplied by the corresponding power of 2
            decimal += bit * Math.pow(2, power);

            power++; // Increment the power for the next bit
        }
        return decimal;
    }
}
