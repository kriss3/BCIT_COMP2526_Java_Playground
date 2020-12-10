package Java_101.ControlStatements;

import java.util.Scanner;

public class Age {

    public static final int AGE_OF_MAJORITY = 21;

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        final int age = scan.nextInt();

        System.out.println("You entered: " + age);

        if (age < AGE_OF_MAJORITY) {
            System.out.println("Youth is a wonderful thing. Enjoy.");
        }

        System.out.println("Age is a state of mind.");

        scan.close();
    }
}
