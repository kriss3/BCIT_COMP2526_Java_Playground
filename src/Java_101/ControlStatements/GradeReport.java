package Java_101.ControlStatements;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        final int binSize = 10;
        final int perfect = 10;
        final int average = 7;

        final Scanner scan = new Scanner(System.in);

        System.out.print("Enter a numeric grade (0 to 100): ");
        final int grade = scan.nextInt();

        final int category = grade / binSize;

        System.out.print("That grade is ");

        switch (category) {
            case perfect -> System.out.println("a perfect score. Well done.");
            case perfect - 1 -> System.out.println("well above average. Excellent.");
            case average + 1 -> System.out.println("above average. Nice job.");
            case average -> System.out.println("average.");
            case average - 1 -> {
                System.out.println("below average. You should see the");
                System.out.println("instructor to clarify the material "
                        + "presented in class.");
            }
            default -> System.out.println("not passing.");
        }

        scan.close();
    }
}
