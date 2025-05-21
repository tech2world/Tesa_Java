import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker ---");
        System.out.print("Enter a string to check if it's a palindrome: ");

        String inputString = scanner.nextLine();

        // Call the function to check if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("'" + inputString + "' IS a palindrome.");
        } else {
            System.out.println("'" + inputString + "' IS NOT a palindrome.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String text) {
        // 1. Handle null or empty string
        if (text == null || text.isEmpty()) {
            // An empty string can be considered a palindrome, or you might choose false.
            return true;
        }

        //    - Convert to lowercase
        //    - Remove all non-alphanumeric characters (spaces, punctuation, etc.).
        //      The regex "[^a-z0-9]" matches any character that is NOT a lowercase letter or a digit.

        String cleanedText = text.toLowerCase().replaceAll("[^a-z0-9]", "");

        // If after cleaning, the string is empty, it's a palindrome (e.g., input was "!", cleaned to "").
        if (cleanedText.isEmpty()) {
            return true;
        }

        //  Use two pointers to compare characters from both ends
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            // If characters at current pointers do not match, it's not a palindrome
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            // Move pointers inward
            left++;
            right--;
        }

        // If the loop completes and  all characters matched, it's a palindrome
        return true;
    }
}
