import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Character Frequency Counter ---");
        System.out.println("Enter a string to count character frequencies:");

        String inputString = scanner.nextLine();

        // Call the method to count character frequencies
        Map<Character, Integer> charFrequencies = countCharFrequencies(inputString);

        System.out.println("\nCharacter Frequencies:");
        // Iterate through the map and print each character and its count
        for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }

        scanner.close();
    }

    private static Map<Character, Integer> countCharFrequencies(String text) {
        // Create a HashMap to store character frequencies.
        // The key is the character, and the value is its count.
        Map<Character, Integer> frequencies = new HashMap<>();

        // Handle null input
        if (text == null) {
            return frequencies; // Return an empty map for null input
        }

        // Iterate through each character of the input string
        for (char ch : text.toCharArray()) {
            // If the character is already in the map, increment its count
            // If it's not in the map, add it with a count of 1
            frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
        }

        return frequencies;
    }
}
