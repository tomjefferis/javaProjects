package guessinggame;

import java.util.*;

public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 99;
        int target = rand.nextInt(upperbound);
        target++;
        System.out.println("the target is " + target);
        int guess;
        
        
        do{
            System.out.printf("Pick number between 1 and 100\n");
            Scanner keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            if (guess == 0)
            {
                System.exit(0);
            }
            if (guess < target)
            {
                System.out.println("Wrong! To low. Try again!");
            }
            if (guess > target)
            {
                System.out.println("Wrong! To high. Try again!");
            }
        }
            while (guess != target);
        }
    }
    
