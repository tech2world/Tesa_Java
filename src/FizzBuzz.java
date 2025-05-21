public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("--- FizzBuzz Game ---");
        System.out.print("Output: "); // single-line output

        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            String output = ""; // store output for each number

            // Check if the number is a multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                output = "FizzBuzz";
            }
            // Check if the number is a multiple of 3
            else if (i % 3 == 0) {
                output = "Fizz";
            }
            // Check if the number is a multiple of 5
            else if (i % 5 == 0) {
                output = "Buzz";
            }
            // If none of the above, use the number itself
            else {
                output = String.valueOf(i); // Convert the integer to a string
            }

            // Print the output for the current number
            System.out.print(output);

            // Add a comma and space separator if it's not the last number
            if (i < 100) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
