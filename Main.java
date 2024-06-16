// Java program for the above approach
import java.util.Scanner;

public class Main {
    // Function that implements the number guessing game
    public static void guessingNumberGame() {
        // Scanner Class
        Scanner sc = new Scanner(System.in);
        // Generate the numbers
        int number = 1 + (int) (100 * Math.random());
        // Given atmost random number of trials
        int trials = 5;
        int i, guess;
        System.out.println("A number is chosen between 1 to 100.\n" + "Guess the number within "+ trials +" trials.");

        // Iterate over atmost number of Trials
        for ( i = 0; i < trials; i++) {
            System.out.println("\nGuess the number:");
            // Take input for guessing
            guess = sc.nextInt();
            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
                //when guessing number is greater than your actual number
            } else if (number > guess && i != trials-1 ) {
                System.out.println("The number is " + "greater than " + guess);
                //opposite to the last case
            } else if (number < guess && i != trials-1 ) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
        if (i == trials) {
            System.out.println("You have exhausted all " + trials +" trials."); //no matching of guess numbers with the actual number
            //after success or failure it will show the guessed number.
            System.out.println("The number was " + number);
        }
    }
    // Driver Code //Dry Run
    public static void main(String[] arg) {
        // Function Call to keep the code run safely
        guessingNumberGame();
    }
}