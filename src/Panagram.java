public class Panagram {
    public static void main(String[] args) {
        String testSentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(testSentence));
    }
    public static boolean isPanagram(String sentence){
        // convert sentence to lwercase
        sentence = sentence.toLowerCase();

        // create an empty array to track all the alphabets present
        boolean[] lettersPresent = new boolean[26];

        // loop through each character
        for ( int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            // check if char is a lower case letter
            if (currentChar >= 'a' && currentChar <= 'z') {
                int index = currentChar - 'a'; // calculate the index
                lettersPresent[index] = true;
            }
        }
        // check if all letters are present
        for (boolean present : lettersPresent) {
            if (!present) {
                return false;
            }
        }
        return true;
    }
}
