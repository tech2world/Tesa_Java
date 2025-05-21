import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Rock, Scissors, Paper Game ---");
        System.out.println("Rules: Rock beats Scissors, Paper beats Rock, Scissors beats Paper... Goodluck!");
        System.out.println("Enter your choices simultaneously, separated by a space (e.g., 'rock paper').\n");

        // Take input from both players at once
        System.out.print("Player 1 and Player 2, enter your choices: ");
        String Inputs = scanner.nextLine().toLowerCase(); // Read the entire line and convert to lowercase

        // Split the combined input into individual choices
        String[] choices = Inputs.split(" "); // Split the string by space

        String player1Choice, player2Choice;

        // Basic validation to ensure two choices were entered
        if (choices.length == 2) {
            player1Choice = choices[0];
            player2Choice = choices[1];
        } else {
            System.out.println("Invalid input. Please enter two choices separated by a space (e.g., 'rock paper').");
            scanner.close();
            return;
        }
        // validate user choices
        boolean player1Valid = player1Choice.equals("rock") || player1Choice.equals("scissors") || player1Choice.equals("paper");
        boolean player2Valid = player2Choice.equals("rock") || player2Choice.equals("scissors") || player2Choice.equals("paper");

        if (!player1Valid || !player2Valid) {
            if (!player1Valid) {
                System.out.println("Player 1 entered an invalid choice: '" + player1Choice +
                        "'. Please choose 'rock', 'scissors', or 'paper'.");
            }
            if (!player2Valid) {
                System.out.println("Player 2 entered an invalid choice: '" + player2Choice +
                        "'. Please choose 'rock', 'scissors', or 'paper'.");
            }
            scanner.close();
            return;
        }

        System.out.println("\nPlayer 1 : " + player1Choice);
        System.out.println("Player 2 : " + player2Choice);

        // Tie condition
        if (player1Choice.equals(player2Choice)) {
            System.out.println("It's a tie!");
        }
        // Player 1 wins.
        else if ((player1Choice.equals("rock") && player2Choice.equals("scissors")) ||
                (player1Choice.equals("paper") && player2Choice.equals("rock")) ||
                (player1Choice.equals("scissors") && player2Choice.equals("paper"))) {
            System.out.println("Player 1 wins!");
        }
        // Player 2 wins conditions (all other valid combinations)
        else {
            System.out.println("Player 2 wins!");
        }

        scanner.close();
    }
}
