import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Word Counter ---");
        System.out.println("Enter a sentence or phrase to count the words:");

        String inputString = scanner.nextLine();

        // Call the method to count words
        int wordCount = countWords(inputString);

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }


    private static int countWords(String text) {
        // 1. Handle null or empty string
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

//         Trim leading/trailing whitespace

        String trimmedText = text.trim();

        // 3. Split the string by one or more whitespace characters.
        String[] words = trimmedText.split("\\s+");

        // 4. The number of elements in the resulting array is the word count.
        return words.length;
    }
}
