import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object
        System.out.println("Enter your Password with at least 1 uppercase, 1 lowercase and 1 number: ");

        String userPassword = scanner.nextLine(); //read user input

        // check password length and Validity
        if (userPassword.length() < 8) {
            System.out.println("Your Password should be at least 8 characters long");
        }
        else {
            // check for uppercase, lowercase and digits
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;

            for ( char ch : userPassword.toCharArray() ){ // create an array of characters char []
//                System.out.println(ch);
                if (Character.isUpperCase(ch)){
                    hasUpperCase = true;
                }
                else if (Character.isLowerCase(ch)){
                    hasLowerCase = true;
                }
                else if (Character.isDigit(ch)){
                    hasDigit = true;
                }

                // check if all conditions are met
                if (hasUpperCase && hasLowerCase && hasDigit) {
                    break;
                }
            }
            //print output
            if ( hasUpperCase && hasLowerCase && hasDigit){
                System.out.println(" Password saved successfully");
            }
            // check which condition is not met
            else {
                System.out.print("Your Password must contain:");
                if (!hasUpperCase) {
                    System.out.print(" at least one uppercase letter,");
                }
                if (!hasLowerCase) {
                    System.out.print(" at least one lowercase letter,");
                }
                if (!hasDigit) {
                    System.out.print(" at least one digit,");
                }
                // remove trailing comma
                System.out.println("\b.");
            }
        }
        scanner.close();
    }
}
