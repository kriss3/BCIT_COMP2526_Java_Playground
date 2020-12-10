package Java_101.ControlStatements;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    private static final int MAX = 10;

    /**
     * Plays a simple guessing game with the user.
     *
     * @param args command line argument (unused)
     */
    public static void main(String[] args) {

        System.out.print("I'm thinking of a number between 1 and "
                + MAX + ". Guess what it is: ");
        final Scanner scan = new Scanner(System.in);
        final int guess = scan.nextInt();

        final Random generator = new Random();
        final int answer = generator.nextInt(MAX) + 1;
        if (guess == answer) {
            System.out.println("You got it! Good guessing!");
        } else {
            System.out.println("That is not correct, sorry.");
            System.out.println("The number was " + answer);
        }

        scan.close();
    }
}
