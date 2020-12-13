package Java_101.Scanner;

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {

        System.out.println("Enter a line of text:");
        final Scanner scan = new Scanner(System.in);
        final String message = scan.nextLine();
        System.out.println("You entered: \"" + message + "\"");
        scan.close();
    }
}
