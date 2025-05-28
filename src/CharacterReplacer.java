import java.util.Scanner;

public class CharacterReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String originalText = scanner.nextLine();

        System.out.print("Enter character you would like to replace: ");
        char oldChar = scanner.nextLine().charAt(0);

        System.out.print("Enter replacement character: ");
        char newChar = scanner.nextLine().charAt(0);

        //call static function directly
        String result = replaceCharacter(originalText, oldChar, newChar);

        System.out.println("\nOriginal Text : "+ originalText);
        System.out.println("Modified Text: "+ result);

    }

    public static String replaceCharacter(String originalText, char charToFind, char replacementChar) {
        if (originalText == null || originalText.isEmpty()) {
            return null;
        }
        return originalText.replace(charToFind, replacementChar);
    }
}
