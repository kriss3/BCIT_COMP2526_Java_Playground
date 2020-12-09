package Java_101.Scanner;

import java.util.Scanner;

/**
 * Will play with scanner library.
 * We must clear the buffer and the newline by invoking the method
 * and not assigning the contents to anything.
 *
 * If we invoke nextLine( ) immediately after, without clearing the buffer,
 * the newline character is still there
 */
public class ScannerGotcha {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        String userInput = "Yes";

        while (userInput.equalsIgnoreCase("Yes")) {
            System.out.println("What's the most interesting thing you learned today?");
            String factoid = sc.nextLine();
            System.out.println("What percentage of your waking time do you spend studying?");
            double studyRatio = sc.nextDouble();
            System.out.println("How many candy bars can you eat in a single sitting?");
            int chocoholic = sc.nextInt();
            sc.nextLine(); // What happens if we omit this line of code?!
            System.out.print("Play again? (Enter yes): ");
            userInput = sc.nextLine();

        }
        sc.close();
    }
}
