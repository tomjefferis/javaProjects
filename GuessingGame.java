package guessinggame;

import java.util.*;

public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int playNum = 1;
        Random rand = new Random();
        int upperbound = 99;
        int target = rand.nextInt(upperbound);
        target++;
        System.out.println("The target is " + target); // for testing
        int guess;
        int count = 0;
        int timesPlayed = 0;
        System.out.printf("Press 0 to quit\n");

        do {
            count++;
            System.out.printf("Pick number between 1 and 100\n");
            Scanner keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            if (guess == 0) {
                playNum = 0;
                timesPlayed++;
            }
            else if (guess < target) {
                System.out.println("Wrong! To low. Try again!");
            }
            else if (guess > target) {
                System.out.println("Wrong! To high. Try again!");
            }
            else  {
                System.out.println("Number of guesses was " + count);
                System.out.println("Would you like to play again? Yes=1 No=0");
                playNum = keyboard.nextInt();
                count = 0;
                target = rand.nextInt(upperbound);
                target++;
                System.out.println("The new target is " + target);
                timesPlayed++;
            }

        } while (guess != target && playNum != 0);
        System.out.println("You played " + timesPlayed + " times!");
        System.exit(0);
    }
}
