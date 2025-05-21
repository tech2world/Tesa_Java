import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
//        generate a random number btw 1 - 50

        Random random = new Random();
        int secretNumber = random.nextInt(50) + 1;

        System.out.println(" Pick a number between 1 and 50.");

        int guess; // user guess
        int attemptsLeft = 5; // User has 5 attempts
        Scanner scanner = new Scanner(System.in); // get input

// tracking number of guesses left
        while (attemptsLeft > 0) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            //  Check if guess is correct
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed it!");
                scanner.close();
                return;
            } else {
                attemptsLeft--; // Decrement attempts left
                if (guess < secretNumber) {
                    System.out.println("Too low! You have " + attemptsLeft + " attempts left.");
                } else {
                    System.out.println("Too high! You have " + attemptsLeft + " attempts left.");
                }
            }
        }

        // Game Over
        System.out.println("Game over! The correct number was " + secretNumber + ".");

    }
}
