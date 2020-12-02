package Exceptions;

import java.util.Scanner;

public class MyExceptions {

    public static void main(String[] args) throws  OutOfRangeException {

        final int minimum = 25;
        final int maximum = 40;

        final Scanner scan = new Scanner(System.in);

        final OutOfRangeException aProblem =
                new OutOfRangeException("Input value is out of range.");

        System.out.print("Enter an integer value between "
                + minimum + " and " + maximum + ", inclusive: ");

        final int value = scan.nextInt();
        scan.close();

        if (value < minimum || value > maximum) {
            throw aProblem;
        }

        System.out.println("End of main method.");
    }
}
